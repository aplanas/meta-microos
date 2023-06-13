SUMMARY = "Plugin for Psi"
DESCRIPTION = "A Psi plugin for filtering messages."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-messagefilterplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "d52474c6304552875015b545ec073586d8dfbbe0e1e97fd8f70a98aa64e7f297b60b84d71abf2f9a2c1e248fc045915ab4a48596cc41739272ef30f2af39a0d3"

RPROVIDES:${PN} += "libmessagefilterplugin.so()(64bit) \
psi+-plugins-messagefilterplugin \
psi+-plugins-messagefilterplugin(aarch-64)"

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
