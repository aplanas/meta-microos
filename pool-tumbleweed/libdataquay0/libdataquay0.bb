SUMMARY = "C++ API for RDF data stores"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt5 classes and containers."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libdataquay0-0.9.1-2.23.aarch64.rpm"
RPM_HASH = "d174497c1ccd54cc15a5e0a6e80cbe7656ef8501eaabb82979f1c020a847dfc9edae9cba5f527a15ae18a170fbf7fa6de3227aa5fbff0161b88490f4d6ee4c6f"

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
