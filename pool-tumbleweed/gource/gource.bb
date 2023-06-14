SUMMARY = "Software version control visualization tool"
DESCRIPTION = "Gource is a software version control visualization tool. \
 \
Software projects are displayed by Gource as an animated tree \
with the root directory of the project at its centre. Directories \
appear as branches with files as leaves. Developers can be seen \
working on the tree at the times they contributed to the project. \
 \
Currently there is first party support for Git and Mercurial, \
and third party (using additional steps) for CVS and SVN."
LICENSE = "GPL-3.0-or-later"

PV = "0.54"

RPM_NAME = "gource-0.54-1.4.aarch64.rpm"
RPM_HASH = "b47e511030239fb73c683e9196f825f87a97631830c710876b761cd4367caf5449b01e21ec09b5e201d906061f43cac846c684385bcf86cb776a7839aaaf3d8a"

RPROVIDES:${PN} += "gource"

RDEPENDS:${PN} += "freefont \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtinyxml.so.0"

inherit rpm
