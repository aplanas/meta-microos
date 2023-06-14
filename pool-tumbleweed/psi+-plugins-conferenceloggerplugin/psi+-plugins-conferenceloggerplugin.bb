SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to save conference logs in which the Psi+ user sits."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-conferenceloggerplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "b2bf7d932dad672f31ded4bab189e70fa95bf3ee8750d860f25f849e9f6b8d417ab2fe81e6cd7c22458cab38aab9fc28c226403098602e308d002c933a2da794"

RPROVIDES:${PN} += "libconferenceloggerplugin.so \
psi+-plugins-conferenceloggerplugin"

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
