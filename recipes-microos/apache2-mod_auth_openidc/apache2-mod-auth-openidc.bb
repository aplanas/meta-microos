SUMMARY = "Apache2.x module for an OpenID Connect enabled Identity Provider"
DESCRIPTION = "This module enables an Apache 2.x web server to operate as an OpenID Connect Relying Party and/or OAuth 2.0 Resource Server."
LICENSE = "Apache-2.0"

PV = "2.4.12.2"

RPM_NAME = "apache2-mod_auth_openidc-2.4.12.2-1.4.aarch64.rpm"
RPM_HASH = "fd2dc13fb49572804ef8eb867b3f0b88a3708d68f92bcf2fd4dc1dd000a499944798c7e0119de414e1425bf4d0ac9103748ede17f2643792d8c850f51746ac92"

RPROVIDES:${PN} += "apache2-mod_auth_openidc \
apache2-mod_auth_openidc(aarch-64)"
RDEPENDS:${PN} += "apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcjose.so.0()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libhiredis.so.1.1.0()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libpcre.so.1()(64bit) \
suse_maintenance_mmn_0"

inherit rpm
