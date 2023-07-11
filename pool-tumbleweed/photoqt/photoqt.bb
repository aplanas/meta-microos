SUMMARY = "A Qt-based image viewer"
DESCRIPTION = "PhotoQt is a configurable image viewer."
LICENSE = "GPL-2.0-or-later"

PV = "3.3"

RPM_NAME = "photoqt-3.3-1.1.aarch64.rpm"
RPM_HASH = "e80f37091737e650369dc6eb7a3cfcb92be101e10a83252e6f70f62ff862d179ece45e2a623c94ff7617c444086aeff4591947f29461fc557f4e47ef52c70d81"

RPROVIDES:${PN} += "photoqt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIL.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libarchive.so.13 \
libc.so.6 \
libexiv2.so.28 \
libfreeimage.so.3 \
libgcc-s.so.1 \
libpoppler-qt5.so.1 \
libpugixml.so.1 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
