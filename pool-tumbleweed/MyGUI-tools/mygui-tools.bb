SUMMARY = "Tools applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains tools applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-tools-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "40e21cc4eec9aa5915ddd3352260758fef4c8a8e8325a3558d46d8d5f83c87a54861d59c81126dfd4d0f48734000faee244166421b87f6e04bd5cbb1b93ac39e"

RPROVIDES:${PN} += "MyGUI-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
MyGUI \
ld-linux-aarch64.so.1 \
libEditorFramework.so \
libMyGUICommon.so.3.4.1 \
libMyGUIEngine.so.3.4.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
