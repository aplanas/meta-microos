SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows Psi+ to provide a different identification. For example a \
user can set Psi+ to tell others that the user is running Miranda on Windows \
instead of Psi+ on Linux."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-clientswitcherplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "4bedf3a1a1c44034ef52ab8cfdd31520f6bc7d96c5dc0b685b7277b34163ea12ecfebafe133711113607f976deb77ea6db9ed232923343b1d6a92faaa98fb667"

RPROVIDES:${PN} += "libclientswitcherplugin.so \
psi+-plugins-clientswitcherplugin"

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
