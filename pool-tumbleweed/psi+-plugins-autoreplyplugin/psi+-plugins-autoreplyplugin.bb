SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin acts as an auto-answering machine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-autoreplyplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "c83eb975f8f6662287250c9f37f3f48bcbe6c55744c57afc7855080e41750ce7428281620591c2a6a90de4db8dea64a3f151011f540a9920098ee1049d65757b"

RPROVIDES:${PN} += "libautoreplyplugin.so()(64bit) \
psi+-plugins-autoreplyplugin \
psi+-plugins-autoreplyplugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
psi+"

inherit rpm
