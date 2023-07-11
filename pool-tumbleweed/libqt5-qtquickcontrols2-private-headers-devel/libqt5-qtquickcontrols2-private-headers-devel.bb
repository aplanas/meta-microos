SUMMARY = "Headers for the unstable API of the Qt5 QuickControls2 module"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 QuickControls 2 module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde6"

RPM_NAME = "libqt5-qtquickcontrols2-private-headers-devel-5.15.10+kde6-1.1.aarch64.rpm"
RPM_HASH = "601909248c96c55f60991a6b74f3eba5f282f3a8c78766c74ad43e203c704166ccaf0d2ccbd16f203cc327c2dd8bc38ce5bd1b7f8242e4a54f6adc3c05276422"

RPROVIDES:${PN} += "libqt5-qtquickcontrols2-private-headers-devel"

RDEPENDS:${PN} += "libQt5QuickControls2-devel \
libQt5QuickTemplates2-devel"

inherit rpm
