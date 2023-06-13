SUMMARY = "Utilities to work with RDF data"
DESCRIPTION = "Utilities to work with RDF data. \
Sord is a lightweight C library for storing RDF data in memory."
LICENSE = "ISC"

PV = "0.16.14"

RPM_NAME = "sord-0.16.14-1.3.aarch64.rpm"
RPM_HASH = "be2febceed74db1935f25ab185dd47ef31a6c45827ca1034b787b3234bdd08b1ce50dcd4fe8c13d8fb8b513b5e04ea21768791a45f57ad62e92ad3814aed045b"

RPROVIDES:${PN} += "sord \
sord(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libserd-0.so.0()(64bit) \
libsord-0.so.0()(64bit)"

inherit rpm
