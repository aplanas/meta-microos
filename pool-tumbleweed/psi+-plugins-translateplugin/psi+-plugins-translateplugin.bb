SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows you to convert selected text into another language."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-translateplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "d13dacd8de3c536efdc2e57bee2b9b92cfde2df312eaa999a64a1977cb01740826adbf9454d9cb1b044f075bd873f9cef5d4dfd318c1c9773d9eb7c3e88740fa"

RPROVIDES:${PN} += "libtranslateplugin.so \
psi+-plugins-translateplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
