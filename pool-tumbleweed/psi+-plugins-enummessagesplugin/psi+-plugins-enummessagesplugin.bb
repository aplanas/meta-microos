SUMMARY = "Plugin for Psi"
DESCRIPTION = "The plugin is designed to enumerate messages, adding the messages numbers in \
chat logs and notification of missed messages. \
 \
Supports per contact on / off message enumeration via the buttons on the chats \
toolbar."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-enummessagesplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "ac9f4361193c3ff3b54e6f6d329efe5343611c45f610c34adfaccc8e086e628ce38f1c04697dace9ff1eebdebf76dfbaa27c8460be30b93b4e67088ca97966a0"

RPROVIDES:${PN} += "libenummessagesplugin.so()(64bit) \
psi+-plugins-enummessagesplugin \
psi+-plugins-enummessagesplugin(aarch-64)"

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
