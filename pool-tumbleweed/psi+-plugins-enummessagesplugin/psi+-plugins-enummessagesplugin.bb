SUMMARY = "Plugin for Psi"
DESCRIPTION = "The plugin is designed to enumerate messages, adding the messages numbers in \
chat logs and notification of missed messages. \
 \
Supports per contact on / off message enumeration via the buttons on the chats \
toolbar."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-enummessagesplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "8fc5b17c625d0a0b212b65c0c41576b4030a4c30c54856dcee99639189abdec94fa65fd71b2897efee7a594d94b7b359727e9ff3d4a82a54e863303d4e6020a5"

RPROVIDES:${PN} += "libenummessagesplugin.so \
psi+-plugins-enummessagesplugin"

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
