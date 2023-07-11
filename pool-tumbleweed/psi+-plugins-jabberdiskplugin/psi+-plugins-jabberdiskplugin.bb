SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds support for remote jabber disks into Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-jabberdiskplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "482a41f97a332d2528fc93a51e207964e162e1a871f713e7ffaa45d7126432dde661344ab3a297ac347ed607cf92a5d7a307eab5c28eceae0fd7b1c0297518c0"

RPROVIDES:${PN} += "libjabberdiskplugin.so \
psi+-plugins-jabberdiskplugin"

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
