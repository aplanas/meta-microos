SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package the libjpegexr shared library"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "libjpegxr0-1.1-4.9.aarch64.rpm"
RPM_HASH = "a8e0175426496a5e2bd68f0ccfdfc7b5451dc1a87e314a3fa5499c11721ae1ac2dcdb435bf640409cc3a489df94408535b648475a4abd54fede5b9d9e75905c4"

RPROVIDES:${PN} += "libjpegxr.so.0()(64bit) \
libjpegxr0 \
libjpegxr0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
