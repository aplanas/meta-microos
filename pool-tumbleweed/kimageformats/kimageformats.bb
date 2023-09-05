SUMMARY = "Image format plugins for Qt"
DESCRIPTION = "This framework provides additional image format plugins for QtGui.  As \
such it is not required for the compilation of any other software, but \
may be a runtime requirement for Qt-based software to support certain \
image formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kimageformats-5.109.0-2.1.aarch64.rpm"
RPM_HASH = "a65025d96205c98404309fa7f911a71ac7b69c9c5a39daca4a1f51b8dcbdf6b3c61143a91a37fc7b2556d12328242fc42928f1301c4cb13c87780367bdc6c89c"

RPROVIDES:${PN} += "kimageformats"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libImath-3-1.so.29 \
libKF5Archive.so.5 \
libOpenEXR-3-1.so.30 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5PrintSupport5 \
libavif.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
libm.so.6 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
