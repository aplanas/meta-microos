SUMMARY = "C++ API for RDF data stores"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt5 classes and containers."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libdataquay0-0.9.1-2.22.aarch64.rpm"
RPM_HASH = "651fd0e9eaee8da3e46eb1bd58ad66afa47bc5870229b8f3e52adc38bc0f1c5a3cd93362b4b2d14c1c21270eac504831ed54399532440d0939fbc436cc3777f4"

RPROVIDES:${PN} += "libdataquay.so.0()(64bit) \
libdataquay0 \
libdataquay0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
librdf.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
