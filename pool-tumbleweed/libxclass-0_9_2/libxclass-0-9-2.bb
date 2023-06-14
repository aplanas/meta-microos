SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "libxclass-0_9_2-0.9.2-188.6.aarch64.rpm"
RPM_HASH = "1adabd601059a59969c5b633fd10cd8b69f95f9c60f05eb3c0e7151d7a1899ee1dda13a6f495de5f744dc4fa770f49c771a4381896ba6ac9257fb0523a93c055"

RPROVIDES:${PN} += "libxclass-0-9-2 \
libxclass.so.0.9.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
xclass"

inherit rpm
