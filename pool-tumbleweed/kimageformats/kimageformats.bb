SUMMARY = "Image format plugins for Qt"
DESCRIPTION = "This framework provides additional image format plugins for QtGui.  As \
such it is not required for the compilation of any other software, but \
may be a runtime requirement for Qt-based software to support certain \
image formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kimageformats-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9b74e7296bacdcbacf84d4f478263ead81d0f048766744312464992c644766995a2b93ac901cdbf236b2adb53d4f5e77baaa63b979675477d7cc10829863b648"

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
