SUMMARY = "Lazarus Component Library - GTK2 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the GTK3 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-lcl-gtk3-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "68330b7579732f4dad1d0eca1a38770b0b81e8100c711dfde3c0973a07230a9b16ac0175d1a42e67b4ea6469d8b78a8f4964b348b41eb9943472eb3e00dcc122"

RPROVIDES:${PN} += "lazarus-lcl-gtk3"

RDEPENDS:${PN} += "gtk3-devel \
lazarus-lcl"

inherit rpm
