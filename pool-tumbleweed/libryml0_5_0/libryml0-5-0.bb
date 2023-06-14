SUMMARY = "A library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
ryml parses both read-only and in-situ source buffers; the resulting \
data nodes hold only views to sub-ranges of the source buffer. No \
string copies or duplications are done."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libryml0_5_0-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "28f9a0a602437937304f3d8112ec10c5360e9b7e170382e8e4b0c01019629a102c6f5aafcf370a22865ea3385b00a02cf222dd008e245ff12f64123f14d8555e"

RPROVIDES:${PN} += "libryml.so.0.5.0 \
libryml0-5-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
