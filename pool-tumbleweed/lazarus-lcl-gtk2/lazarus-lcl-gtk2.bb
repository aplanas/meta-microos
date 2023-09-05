SUMMARY = "Lazarus Component Library - GTK2 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the GTK2 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-lcl-gtk2-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "07aa1b517d4b73c45cc552811633dac76016549dac48cef61609f4db73a6fc6a07f1022147cd1b7911f8d1678fcacbfb6fb0840203cba775c49cba612034fd29"

RPROVIDES:${PN} += "lazarus-lcl-gtk2"

RDEPENDS:${PN} += "gtk2-devel \
lazarus-lcl"

inherit rpm
