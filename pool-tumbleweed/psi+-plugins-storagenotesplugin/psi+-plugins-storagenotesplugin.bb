SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is an implementation of XEP-0049: Private XML Storage."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-storagenotesplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "f41e99d9cc7e2e9f277951ae189313ff52f3a6d29ee71daf1d28a1520442f2c5d9fc4c31bb8b11ca0feefc514bba3a4550cc4f2054d63a9558c7b26b9a282fc9"

RPROVIDES:${PN} += "libstoragenotesplugin.so \
psi+-plugins-storagenotesplugin"

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
