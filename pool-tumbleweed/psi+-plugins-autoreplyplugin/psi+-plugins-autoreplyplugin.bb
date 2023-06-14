SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin acts as an auto-answering machine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-autoreplyplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "c83eb975f8f6662287250c9f37f3f48bcbe6c55744c57afc7855080e41750ce7428281620591c2a6a90de4db8dea64a3f151011f540a9920098ee1049d65757b"

RPROVIDES:${PN} += "libautoreplyplugin.so \
psi+-plugins-autoreplyplugin"

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
