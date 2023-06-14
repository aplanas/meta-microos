SUMMARY = "OpenVPN auth-pam plugin"
DESCRIPTION = "The OpenVPN auth-pam plugin implements username/password authentication \
via PAM, and essentially allows any authentication method supported by \
PAM (such as LDAP, RADIUS, or Linux Shadow passwords) to be used with \
OpenVPN. \
 \
While PAM supports username/password authentication, this can be \
combined with X509 certificates to provide two indepedent levels of \
authentication. \
 \
This plugin uses a split privilege execution model which will function \
even if you drop openvpn daemon privileges using the user, group, or \
chroot directives."
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.4"

RPM_NAME = "openvpn-auth-pam-plugin-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "d6c37c6bd6327caeb65b22d9ebeb5c66081dc05a44cfe6e4dc9946bd8a60d823dd9717c9a54fd0385e19341c63f019a673bac3f4c75c4545774feb24a094cff6"

RPROVIDES:${PN} += "openvpn-auth-pam-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
openvpn"

inherit rpm
