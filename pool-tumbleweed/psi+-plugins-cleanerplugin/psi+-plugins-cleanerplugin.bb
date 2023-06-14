SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to clear the avatar cache, saved local copies of vCards \
and history logs."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-cleanerplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "da1a471e31bd42c873ee37735fe3ec32e9d608afe44db4610220cfdb1f97a72354f942f748b68ac90f477382b09fd9d6cdd7abfaae19e0ac83b7c2308a4b3233"

RPROVIDES:${PN} += "libcleanerplugin.so \
psi+-plugins-cleanerplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
