SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to allow easy configuration of some advanced options in \
Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-extendedoptionsplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "021227e870dc1b35fa02612f0cd1f99e08289feb3af4042e0248a949375be4d12ac64038eee887978f1f5ca0e5fd3f92d66253a450bf358aeb309ea46d850b55"

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
