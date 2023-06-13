SUMMARY = "Library for converting bitmaps to vector graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.1"

RPM_NAME = "autotrace-devel-0.31.1-646.3.aarch64.rpm"
RPM_HASH = "8d2a6f43edd788cfe70ef7d432e78fbf31abfcdf4b4f4c5235c1bcf12df57d09fdc82c146ecb3d1faa2b5a62c5dd241bb730261bb1f2d095f9526e37f97d2110"

RPROVIDES:${PN} += "autotrace-devel \
autotrace-devel(aarch-64) \
pkgconfig(autotrace)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libautotrace3"

inherit rpm
