SUMMARY = "Program for Converting Bitmaps to Vector Graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.1"

RPM_NAME = "autotrace-0.31.1-646.3.aarch64.rpm"
RPM_HASH = "7691481a0bc7f2eae012c42206f55b38aa397ad1ae6725032345bb52af8e2d3fd91bd7a30dc17c8ac872f50dfc0ea90de99f89b6472162963e9edd09c4bad42d"

RPROVIDES:${PN} += "autotrace \
autotrace(aarch-64) \
bitmap_tracing"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libautotrace.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpng16.so.16()(64bit)"

inherit rpm
