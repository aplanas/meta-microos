SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to make it easy to download and install iconsets and \
other resources for Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-contentdownloaderplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "6e13ae1bcf8a16186703b124a4014cc87b583e9e8bd3aacfead23ce223da914fff3b2121ac65248e13a4841cfbdccc2703781aa1d0934735541b56958a8493ee"

RPROVIDES:${PN} += "libcontentdownloaderplugin.so \
psi+-plugins-contentdownloaderplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
