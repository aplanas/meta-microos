SUMMARY = "Gallery application built using Kirigami"
DESCRIPTION = "Example application which uses all features from kirigami, \
including links to the sourcecode, tips on how to use the \
components and links to the corresponding HIG pages and \
code examples on cgit"
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kirigami-gallery-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "79055c7858d606bc14032b1111d3cd4050aa0924f6271aff727174126f2a8c70c39b07dcd70dd1c3194d616db590b6b72b1c4db359f68eece0a78ad3f7e0cba8"

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
