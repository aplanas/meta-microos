SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to send images to roster contacts."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-imageplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "7ec5d626e232af0f86ca969fea54df277cee62c88a769c7bafb5cc7a0c94356608be0ae57aea39db079c8cd5e9a2d9749dbf46041c6afe970c30e535cd95b67e"

RPROVIDES:${PN} += "libimageplugin.so()(64bit) \
psi+-plugins-imageplugin \
psi+-plugins-imageplugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
psi+"

inherit rpm
