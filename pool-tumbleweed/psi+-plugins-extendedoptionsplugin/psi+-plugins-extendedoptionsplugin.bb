SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to allow easy configuration of some advanced options in \
Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-extendedoptionsplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "537cfaec85b78251d534e71dd9b3f4796f8f9d939d212bfbd5e1d88847a8095664f6e4821c7ea004ca4fb62613b4c7993bb71de3fb24a01602273c3b104446b4"

RPROVIDES:${PN} += "libextendedoptionsplugin.so \
psi+-plugins-extendedoptionsplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
