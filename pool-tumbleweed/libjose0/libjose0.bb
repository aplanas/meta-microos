SUMMARY = "C-language implementation of Javascript Object Signing and Encryption"
DESCRIPTION = "José is a C-language implementation of the Javascript Object Signing and Encryption standards."
LICENSE = "Apache-2.0"

PV = "11"

RPM_NAME = "libjose0-11-1.1.aarch64.rpm"
RPM_HASH = "a04b42b732935c93c2eefe1159f6b19b23e23444ad899e083b6a2beeb88bd4048586d65ac34a3d66042afb19b522904f18c591b9f78d432c70da285a769ab2ad"

RPROVIDES:${PN} += "libjose.so.0()(64bit) \
libjose0 \
libjose0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libjansson.so.4()(64bit) \
libz.so.1()(64bit)"

inherit rpm
