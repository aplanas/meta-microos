SUMMARY = "A Qt-based image viewer"
DESCRIPTION = "PhotoQt is a configurable image viewer."
LICENSE = "GPL-2.0-or-later"

PV = "3.1"

RPM_NAME = "photoqt-3.1-1.1.aarch64.rpm"
RPM_HASH = "eef7da4dfebddda3116d46590c7d223a37424aa83734f0852cd3483dca96e380bc58827a98b9dc86c6a058e6a54d9c80fda65bb8540ceaac962c89fbf5a4a247"

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
libexiv2.so.27 \
libfreeimage.so.3 \
libgcc-s.so.1 \
libpoppler-qt5.so.1 \
libpugixml.so.1 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
