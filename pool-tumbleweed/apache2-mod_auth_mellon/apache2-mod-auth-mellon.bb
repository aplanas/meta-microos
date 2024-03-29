SUMMARY = "A SAML 2.0 authentication module for the Apache Server"
DESCRIPTION = "The mod_auth_mellon module is an authentication service that implements the \
SAML 2.0 federation protocol. It grants access based on the attributes \
received in assertions generated by a IdP server."
LICENSE = "GPL-2.0-or-later"

PV = "0.17.0"

RPM_NAME = "apache2-mod_auth_mellon-0.17.0-2.10.aarch64.rpm"
RPM_HASH = "cbb569c9763f348aa6d59f4d54f560ecd5e6b265218bf5df892f20b2a5047f51430fc0082559f6727b0cb016bc77893044e83b32ebfd1c4f4e9a84f05628781d"

RPROVIDES:${PN} += "apache2-mod-auth-mellon \
config-apache2-mod-auth-mellon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
apache-mmn-20120211 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libglib-2.0.so.0 \
liblasso.so.3 \
liblasso3 \
suse-maintenance-mmn-0"

inherit rpm
