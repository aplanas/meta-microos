SUMMARY = "Library for converting bitmaps to vector graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.1"

RPM_NAME = "libautotrace3-0.31.1-646.4.aarch64.rpm"
RPM_HASH = "dc96efc5c311b0ce401d8d48170b5392d218d5e3bd476981c0287f007a337127f337da25e379e1eb13f39a5b77681a5de6123d7025ea99a68087617a5f3d3dc7"

RPROVIDES:${PN} += "libautotrace.so.3 \
libautotrace3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
