SUMMARY = "Gallery application built using Kirigami"
DESCRIPTION = "Example application which uses all features from kirigami, \
including links to the sourcecode, tips on how to use the \
components and links to the corresponding HIG pages and \
code examples on cgit"
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kirigami-gallery-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "48a7b3219b68ce955ce48185538ef1cd61540dfd09a7b12e3719ac62173484f82a8705ba1429f3ab1b4b7fda1c5f19b4b3f6f7ac17c4a218ce0763ba3bb3ea7f"

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
