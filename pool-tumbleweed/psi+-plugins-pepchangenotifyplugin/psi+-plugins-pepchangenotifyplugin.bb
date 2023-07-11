SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows popup notifications when users from your roster changes \
their mood, tune or activity."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-pepchangenotifyplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "bcfde5e3bbd7b60360851db28110a39af64a0ebc8eec231445f8a20f0fef73574691f9a4b8c292fa0c846bcf889096a64146a02b6f9575b6c42fd64d2a208165"

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
