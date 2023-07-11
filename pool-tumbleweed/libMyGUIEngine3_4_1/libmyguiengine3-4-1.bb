SUMMARY = "Shared library for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains the shared library for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "libMyGUIEngine3_4_1-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "50c92fdf97debef1d0f7ccf026037d8dff268cc8593074de8a18226b32f76c72c7e685d73c45f29e0cfc8ddbdddbc78f2a5440934f516233f446fab9837d0846"

RPROVIDES:${PN} += "libMyGUIEngine.so.3.4.1 \
libMyGUIEngine3-4-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
