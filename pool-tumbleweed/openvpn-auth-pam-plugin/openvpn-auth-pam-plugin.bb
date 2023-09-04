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

PV = "2.6.6"

RPM_NAME = "openvpn-auth-pam-plugin-2.6.6-1.1.aarch64.rpm"
RPM_HASH = "0a33e2fe5bb198d14207e4c2f3cd078390b30402bb441d8c32bf134dcb8cb14b9fb79858e88c36e8b07e3c3a466aa4d462b108ebca41ade7506f76edf1fee23b"

RPROVIDES:${PN} += "openvpn-auth-pam-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
openvpn"

inherit rpm
