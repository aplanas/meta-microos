SUMMARY = "Library for HTTP normalizer and parser"
DESCRIPTION = "The HTP Library is an HTTP normalizer and parser written by Ivan Ristic of Mod Security fame for the OISF. This integrates and provides very advanced processing of HTTP streams for Suricata. The HTP library is required by the engine, but may also be used independently in a range of applications and tools."
LICENSE = "BSD-3-Clause"

PV = "0.5.45"

RPM_NAME = "libhtp2-0.5.45-1.1.aarch64.rpm"
RPM_HASH = "7e61d2772acf481426a65749314a5b414d5650c9ba64312eea816cbc65a3232245759dc17ad6b20fba72eba466f75c99b7f18309c5818e6cf2a3fa58b28291ed"

RPROVIDES:${PN} += "libhtp.so.2 \
libhtp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
