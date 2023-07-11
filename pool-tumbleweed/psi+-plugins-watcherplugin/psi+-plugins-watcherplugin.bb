SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to monitor the status of specific roster contacts, as \
well as for substitution of standard sounds of incoming messages."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-watcherplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "ce719e85f0cc2b1df382039fbaa315921f801117ba849f5068c3644f7e492eed9d946ef76b866d5c66a46905b8e791b20ae4bd8a61557a5ae7754e14174faec3"

RPROVIDES:${PN} += "libwatcherplugin.so \
psi+-plugins-watcherplugin"

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
