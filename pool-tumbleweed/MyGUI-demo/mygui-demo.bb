SUMMARY = "Some demo applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains some demo applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-demo-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "d0b073c51b94d2d0f06b1fd044831f136892d7e80a887993c2aaaaec6a9d9c358f091f8a54b763b264a05da0933c40f007f55c73dfea30923ea43a9c89f13c67"

RPROVIDES:${PN} += "MyGUI-demo"

RDEPENDS:${PN} += "MyGUI \
ld-linux-aarch64.so.1 \
libMyGUI.OgrePlatform.so \
libMyGUICommon.so.3.4.1 \
libMyGUIEngine.so.3.4.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
