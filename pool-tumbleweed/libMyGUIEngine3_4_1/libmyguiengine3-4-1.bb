SUMMARY = "Shared library for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains the shared library for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "libMyGUIEngine3_4_1-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "7efd19759b8512f96eb8757fd67c4e8825b398cbc35d314729a0bcf1283ff25fe2ac79c9073a00cc1785bb6bea62b0a9c04f66db26d4e420c19bcad44e4e54e3"

RPROVIDES:${PN} += "libMyGUIEngine.so.3.4.1()(64bit) \
libMyGUIEngine3_4_1 \
libMyGUIEngine3_4_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
