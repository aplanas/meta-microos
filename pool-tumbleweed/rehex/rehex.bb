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

PV = "0.60.1"

RPM_NAME = "rehex-0.60.1-1.1.aarch64.rpm"
RPM_HASH = "26d17cd8a7955c8f787412cc673fc0124e6e98e9ac3c8a5f2832ee97b81ac80445eb25c4208ae4625873341c9f7cb3e311e3d2f9db43c8464637433664df8d10"

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
libwx-baseu-net-suse.so.3.0.5 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-aui-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5 \
libwx-gtk2u-html-suse.so.3.0.5 \
libwx-gtk2u-propgrid-suse.so.3.0.5"

inherit rpm
