SUMMARY = "MaxMind GeoIP2 database support for Lighttp"
DESCRIPTION = "This module supports fast ip/location lookups using MaxMind \
GeoIP2 databases."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_maxminddb-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "6b1975dd2fa146db0f59cbaec360012628247084d09dfe38968f0ecdab97246890225be784241c05eeb059f342ec9762115bc7fe6205a17e9caa9f959357efef"

RPROVIDES:${PN} += "lighttpd-mod_maxminddb \
lighttpd-mod_maxminddb(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libmaxminddb.so.0()(64bit) \
lighttpd"

inherit rpm
