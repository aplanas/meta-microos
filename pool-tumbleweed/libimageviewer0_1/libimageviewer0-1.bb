SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "This package contains the libraries for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimageviewer0_1-1.0.24-1.2.aarch64.rpm"
RPM_HASH = "e03f7f6008791889c2400725bb909933115be2cef638bfc372605ca8cfbeb1c59fc8426ef0d3d10b6dc8cdac9f1911bc92d5aed11eaf99b475b464e8aa63e567"

RPROVIDES:${PN} += "libimageviewer.so.0.1 \
libimageviewer0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libfreeimage.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
