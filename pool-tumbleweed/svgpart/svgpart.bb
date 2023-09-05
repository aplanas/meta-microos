SUMMARY = "SVG viewer component"
DESCRIPTION = "An SVG viewer component (KPart)."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "svgpart-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1a8d4f7019e6dc0319c1d6792051d82d608691761b809d64bc7f6f1a9319d0bb8497c684152205ea20dacd038ded807b7c77485b36437be9cb663c7d1d76a9e3"

RPROVIDES:${PN} += "svgpart"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
