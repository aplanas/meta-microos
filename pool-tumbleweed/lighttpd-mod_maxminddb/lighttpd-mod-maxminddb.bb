SUMMARY = "MaxMind GeoIP2 database support for Lighttp"
DESCRIPTION = "This module supports fast ip/location lookups using MaxMind \
GeoIP2 databases."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_maxminddb-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "fe07fabe39a663c830ea92be81ae898666bd4843d24d02e79dec07113e2a57a06fd97c7178fa49659537bd90b12a0ec00e6833e6b215a94817d494807b3c066b"

RPROVIDES:${PN} += "lighttpd-mod-maxminddb"

RDEPENDS:${PN} += "libc.so.6 \
libmaxminddb.so.0 \
lighttpd"

inherit rpm
