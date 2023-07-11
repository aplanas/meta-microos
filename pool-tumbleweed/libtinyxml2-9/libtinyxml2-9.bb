SUMMARY = "Basic XML parser in C++"
DESCRIPTION = "TinyXML is a feature-bounded XML parser in C++ that can be integrated \
into other programs. \
 \
TinyXML-2 does not parse or use DTDs (Document Type Definitions) or \
XSLs (eXtensible Stylesheet Language). There are other parsers (with \
different footprints) to do such."
LICENSE = "Zlib"

PV = "9.0.0"

RPM_NAME = "libtinyxml2-9-9.0.0-1.8.aarch64.rpm"
RPM_HASH = "9f41e2381ecac592eb6707fffa2d0848dcef207a94723bb9a818fb3c85ef61833b7613d61b0f1c579567cb394239af01268d7e2c51ed56096eba0ad54a944448"

RPROVIDES:${PN} += "libtinyxml2-9 \
libtinyxml2.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
