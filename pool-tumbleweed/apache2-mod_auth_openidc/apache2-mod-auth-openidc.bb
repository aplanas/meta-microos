SUMMARY = "Apache2.x module for an OpenID Connect enabled Identity Provider"
DESCRIPTION = "This module enables an Apache 2.x web server to operate as an OpenID Connect Relying Party and/or OAuth 2.0 Resource Server."
LICENSE = "Apache-2.0"

PV = "2.4.12.2"

RPM_NAME = "apache2-mod_auth_openidc-2.4.12.2-1.4.aarch64.rpm"
RPM_HASH = "fd2dc13fb49572804ef8eb867b3f0b88a3708d68f92bcf2fd4dc1dd000a499944798c7e0119de414e1425bf4d0ac9103748ede17f2643792d8c850f51746ac92"

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
