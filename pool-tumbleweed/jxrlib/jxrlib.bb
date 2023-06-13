SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package contains the encoder and the decoder tools."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "jxrlib-1.1-4.9.aarch64.rpm"
RPM_HASH = "8d754ca21190554a218c982ee80a81051664332e8fbe27835d5999c9b2d26f08c0ffd5522253cab367fd69eea3217fa82f899bea94b2c72c714f6491dbeca1ff"

RPROVIDES:${PN} += "jxrlib \
jxrlib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjxrglue.so.0()(64bit)"

inherit rpm
