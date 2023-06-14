SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows popup notifications when users from your roster changes \
their mood, tune or activity."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-pepchangenotifyplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "5d8800d5eed8d2cf54e9620c2aeaa334bf3278807337d021f6ebc43965079e45ab3b7f9fb839d26c3fec1062dedc5ec35d5870a329255aa02d6bb88cd066be62"

RPROVIDES:${PN} += "libpepchangenotifyplugin.so \
psi+-plugins-pepchangenotifyplugin"

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
