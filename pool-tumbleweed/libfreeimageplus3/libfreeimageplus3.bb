SUMMARY = "Multi-format Image Decoder Library"
DESCRIPTION = "FreeImage is a library for developers who would like to support \
graphics image formats like PNG, BMP, JPEG, TIFF and others as needed \
by today's multimedia applications."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0"

RPM_NAME = "libfreeimageplus3-3.18.0-6.4.aarch64.rpm"
RPM_HASH = "cb9daddefe8dfa39457e15f04a8de8736e7651500b24f2327d4b8babded3a8142bfee46fb2acd8ff9d095bbbea076f4927416d94de94c6f47ced61c6f3aa3c8d"

RPROVIDES:${PN} += "libfreeimageplus.so.3 \
libfreeimageplus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeimage.so.3 \
libstdc++.so.6"

inherit rpm
