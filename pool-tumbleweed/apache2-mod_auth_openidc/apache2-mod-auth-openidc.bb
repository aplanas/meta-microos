SUMMARY = "Apache2.x module for an OpenID Connect enabled Identity Provider"
DESCRIPTION = "This module enables an Apache 2.x web server to operate as an OpenID Connect Relying Party and/or OAuth 2.0 Resource Server."
LICENSE = "Apache-2.0"

PV = "2.4.12.2"

RPM_NAME = "apache2-mod_auth_openidc-2.4.12.2-1.5.aarch64.rpm"
RPM_HASH = "884f8ac08ab57fa0991db11d35d410feff54c790b78d3aab753788ba1e62ffb56110246189ee2c98ce4f809bcef4c28b0991ec8eefc57977aa7f784249fbb5a1"

RPROVIDES:${PN} += "apache2-mod-auth-openidc"

RDEPENDS:${PN} += "apache-mmn-20120211 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcjose.so.0 \
libcrypto.so.3 \
libcurl.so.4 \
libhiredis.so.1.1.0 \
libjansson.so.4 \
libpcre.so.1 \
suse-maintenance-mmn-0"

inherit rpm
