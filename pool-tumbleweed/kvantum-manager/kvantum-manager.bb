SUMMARY = "GUI for installing, selecting and manipulating Kvantum themes"
DESCRIPTION = "This package provides configuration manager - GUI appligation for installing, selecting and manipulating Kvantum themes."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-manager-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "09da8b91e93e1a9815579d7861b94e123030372dfbbfe8e1263d71f34299b1a914df44c0191ef982015d8802da02c6627f8f39ad7039366cb4c64aff0658bbd2"

RPROVIDES:${PN} += "kvantum-manager"

RDEPENDS:${PN} += "kvantum-qt5 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
