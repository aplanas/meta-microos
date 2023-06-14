SUMMARY = "C++ API for RDF data stores"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt5 classes and containers."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libdataquay0-0.9.1-2.22.aarch64.rpm"
RPM_HASH = "651fd0e9eaee8da3e46eb1bd58ad66afa47bc5870229b8f3e52adc38bc0f1c5a3cd93362b4b2d14c1c21270eac504831ed54399532440d0939fbc436cc3777f4"

RPROVIDES:${PN} += "libdataquay.so.0 \
libdataquay0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
librdf.so.0 \
libstdc++.so.6"

inherit rpm
