SUMMARY = "A SAML 2.0 authentication module for the Apache Server"
DESCRIPTION = "The mod_auth_mellon module is an authentication service that implements the \
SAML 2.0 federation protocol. It grants access based on the attributes \
received in assertions generated by a IdP server."
LICENSE = "GPL-2.0-or-later"

PV = "0.17.0"

RPM_NAME = "apache2-mod_auth_mellon-0.17.0-2.9.aarch64.rpm"
RPM_HASH = "3c2ad99534c4a3aa7076481a5608b7fe9fca2bd0bb3acd9ab32835609a9c1ff05abc66b240dcfa9a736713f6e32891c66c77e006e438ba9cc60066bf7e7e299b"

RPROVIDES:${PN} += "apache2-mod_auth_mellon \
apache2-mod_auth_mellon(aarch-64) \
config(apache2-mod_auth_mellon)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
liblasso.so.3()(64bit) \
liblasso3 \
suse_maintenance_mmn_0"

inherit rpm
