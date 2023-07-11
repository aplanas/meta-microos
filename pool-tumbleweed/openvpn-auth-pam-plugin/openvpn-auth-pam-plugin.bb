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
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.6.5"

RPM_NAME = "openvpn-auth-pam-plugin-2.6.5-1.1.aarch64.rpm"
RPM_HASH = "79377c848ef9d5d9c474fbc51689ebc43b7c6111117787f39ef003c5e6ccd1d8348479b602a0801186ddda47670e0e0aede5347e3ecd8f1c7bfc477cbba3363e"

RPROVIDES:${PN} += "openvpn-auth-pam-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
openvpn"

inherit rpm
