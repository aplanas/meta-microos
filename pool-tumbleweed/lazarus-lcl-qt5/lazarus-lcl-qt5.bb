SUMMARY = "Lazarus Component Library - Qt5 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the Qt5 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-lcl-qt5-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "c7b7b8f9281c7658a5a9e28f51f7165c80f32e60110575fa2105bd57a563db649f69affca9dba6e81e9adc8a48a08a7a9f2791338e74058167e4a792899f06ed"

RPROVIDES:${PN} += "lazarus-lcl-qt5"

RDEPENDS:${PN} += "lazarus-lcl \
libQt5Pas-devel"

inherit rpm
