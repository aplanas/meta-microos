SUMMARY = "Reverse Engineers' Hex Editor"
DESCRIPTION = "A hex heditor with a number of features for analysing and annotating \
binary file formats. \
 \
Current features include: \
 \
    Large file support (tested up to 1 TiB) \
    Decoding of integer/floating point value types \
    Disassembly of machine code \
    Highlighting and annotation of ranges of bytes"
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "rehex-0.5.4-1.5.aarch64.rpm"
RPM_HASH = "521cefcb48ce1a0a73c1b315e132dffa47a6af6f0ab146701f298dced7a9983613a4867d03a8a882ee0952aa361dbc8a8d8ce648cc549f3702e4a52f853d7429"

RPROVIDES:${PN} += "rehex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcapstone.so.4 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjansson.so.4 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libunistring.so.5 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-aui-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5 \
libwx-gtk2u-html-suse.so.3.0.5 \
libwx-gtk2u-propgrid-suse.so.3.0.5"

inherit rpm
