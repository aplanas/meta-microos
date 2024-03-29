SUMMARY = "A tool for flash images to Qualcomm based systems"
DESCRIPTION = "This tool communicates with USB devices of id 05c6:9008 to upload a flash \
loader and use this to flash images. Mostly Qualcomm based systems."
LICENSE = "BSD-3-Clause"

PV = "1.0+git49.20210507"

RPM_NAME = "qdl-1.0+git49.20210507-1.8.aarch64.rpm"
RPM_HASH = "220ba137bd14899f99d9891b22a097966fc5f9f086b8a7c195666ac2aa04e5d35ebd781dd8c6daa3e704591be13ac94c32ac2cb43aa351b10ddd710fbae67ac2"

RPROVIDES:${PN} += "qdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
libxml2.so.2"

inherit rpm
