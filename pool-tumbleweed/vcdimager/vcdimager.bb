SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "vcdimager-2.0.1-3.11.aarch64.rpm"
RPM_HASH = "ae12584bec4e2665eeebea8e584ed48352542ea7393dbf72c5a8c01c6c06e1c5845bc2f35a31af576dfaeb9afe72b5c90bf0d8840e0b0af948ca4eb1f890585d"

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
