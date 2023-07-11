SUMMARY = "Program for Converting Bitmaps to Vector Graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.1"

RPM_NAME = "autotrace-0.31.1-646.4.aarch64.rpm"
RPM_HASH = "0927f114c842e220a1a599b1e6256ac7f7a341ddd754647d08ad9f2adb346a55ce327ed0fea987609eaf362305770362fc533784ecdb5eb43b37d6f1ce374189"

RPROVIDES:${PN} += "autotrace \
bitmap-tracing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libautotrace.so.3 \
libc.so.6 \
libpng16.so.16"

inherit rpm
