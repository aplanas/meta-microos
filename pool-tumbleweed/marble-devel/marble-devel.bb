SUMMARY = "Generic map viewer: Build Environment"
DESCRIPTION = "Development headers and libraries for Marble."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "87b2b32c7e5427ec2d5325383f3356037f5b15f75e947b2820912eddccc1ad1c291a913f5487dd222654549bcdb33c588f15168667c968a444a01e73cef452d7"

RPROVIDES:${PN} += "cmake-Astro \
cmake-Marble \
marble-devel \
marble5-devel"

RDEPENDS:${PN} += "cmake-Qt5WebEngineWidgets \
cmake-Qt5Widgets \
cmake-Qt5Xml \
libastro1 \
libmarblewidget-qt5-28"

inherit rpm
