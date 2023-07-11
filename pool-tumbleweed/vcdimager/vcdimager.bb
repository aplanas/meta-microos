SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "vcdimager-2.0.1-3.12.aarch64.rpm"
RPM_HASH = "f4a4412638925d418c37a7992e1da52dab73a6920e6329024e05b5c641a31fda77113134f8f3ab382660ba31d0fa9b83ea8607a8b9b74dda9ecc667340938c3f"

RPROVIDES:${PN} += "vcdimager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
libpopt.so.0 \
libvcdinfo.so.0 \
libxml2.so.2"

inherit rpm
