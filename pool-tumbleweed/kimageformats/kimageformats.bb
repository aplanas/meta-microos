SUMMARY = "Image format plugins for Qt"
DESCRIPTION = "This framework provides additional image format plugins for QtGui.  As \
such it is not required for the compilation of any other software, but \
may be a runtime requirement for Qt-based software to support certain \
image formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kimageformats-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "988db07ec0515acf1cd84899f4aa0f341ee52885718f35628d86d32f00c98ea2c565a397723b87c032cabdc3d8a0a2e48f728f4b0b38a5ed7958051897735f94"

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
libavif.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
libm.so.6 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
