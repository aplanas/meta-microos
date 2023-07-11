SUMMARY = "Some demo applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains some demo applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-demo-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "468789dd3328bf8a9a090f3693e450902cb3e6ce5054d2a531042e983eb258a6aa7079568df3a8b52f8f1beabe263d5d93d300a210d962acd276aa615469f0c9"

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
