SUMMARY = "Library for converting bitmaps to vector graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.1"

RPM_NAME = "autotrace-devel-0.31.1-646.4.aarch64.rpm"
RPM_HASH = "3789dd555f69982df3d5343894359f1b80ef88717c265df3298a38ef4187b63b7592968551bc97e3d5e8ff651cfc795d9c05c92ef22311e603c7d26e970deade"

RPROVIDES:${PN} += "autotrace-devel \
pkgconfig-autotrace"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libautotrace3"

inherit rpm
