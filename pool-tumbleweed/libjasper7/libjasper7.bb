SUMMARY = "JPEG-2000 library"
DESCRIPTION = "This package contains libjasper, a library implementing the JPEG-2000 \
image compression standard Part 1."
LICENSE = "JasPer-2.0"

PV = "4.0.0"

RPM_NAME = "libjasper7-4.0.0-1.4.aarch64.rpm"
RPM_HASH = "58774914bc957ae5f63ec86e0f20e048de690c0d650797df1758d6bde3a71ab4d5d5676c07fd5fb4f35d98a093aee38ccc0c4bd3b9b419f4041d3197600758ff"

RPROVIDES:${PN} += "libjasper.so.7 \
libjasper7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
