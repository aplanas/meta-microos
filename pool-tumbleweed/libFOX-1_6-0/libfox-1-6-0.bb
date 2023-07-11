SUMMARY = "Shared libraries for the FOX toolkit 1.6"
DESCRIPTION = "This package contains the shared libraries needed \
by applications compiled with the FOX GUI Toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "libFOX-1_6-0-1.6.57-4.2.aarch64.rpm"
RPM_HASH = "72b9beff388d2ea82cccaa3f13ff02d7a1506c872501198f224551f4f170c08145d47f5c50ae7b29e1880369ae0a884b3895e9bc79b344d687e58e66ef6503fb"

RPROVIDES:${PN} += "fox \
libCHART-1.6.so.0 \
libFOX-1-6-0 \
libFOX-1.6.so.0 \
libfox1-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libbz2.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
