SUMMARY = "Gallery application built using Kirigami"
DESCRIPTION = "Example application which uses all features from kirigami, \
including links to the sourcecode, tips on how to use the \
components and links to the corresponding HIG pages and \
code examples on cgit"
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kirigami-gallery-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fa1dbfe7d35770c6af1694832e047bcd7cde653466eab6f518c96d1fca86533fc86403be030bd9eee6c88d3d3aa24651f4fd48298f6942ea57fbab544c2e20a2"

RPROVIDES:${PN} += "kirigami-gallery"

RDEPENDS:${PN} += "kirigami2 \
kitemmodels-imports \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
