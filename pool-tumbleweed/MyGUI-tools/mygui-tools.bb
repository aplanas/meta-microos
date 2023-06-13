SUMMARY = "Tools applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains tools applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-tools-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "394a49adc65cc30d97b3403b80076d66ef20dcb0f93a0f1790b71e358e2c5b811dbb1a8a5e8a62eb5c845e7a18f8d3d3f2590b142d7cb24b4a3ca60daba585b7"

RPROVIDES:${PN} += "MyGUI-tools \
MyGUI-tools(aarch-64) \
application() \
application(FontEditor.desktop) \
application(ImageEditor.desktop) \
application(LayoutEditor.desktop) \
application(SkinEditor.desktop)"

RDEPENDS:${PN} += "/bin/bash \
MyGUI \
ld-linux-aarch64.so.1()(64bit) \
libEditorFramework.so()(64bit) \
libMyGUICommon.so.3.4.1()(64bit) \
libMyGUIEngine.so.3.4.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
