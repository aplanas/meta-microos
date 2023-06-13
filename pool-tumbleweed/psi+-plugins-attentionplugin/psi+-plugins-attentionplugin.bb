SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to send and receive special messages such as Attentions."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-attentionplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "08fd04159b6a0a2f0c1e4317ae8fea11f62cad4861133e135164dd51b69dbd4b18882cbd6f1d705a0e9c11c77578a942aaa7466860902999fa23ef1296eb5142"

RPROVIDES:${PN} += "libattentionplugin.so()(64bit) \
psi+-plugins-attentionplugin \
psi+-plugins-attentionplugin(aarch-64)"

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
