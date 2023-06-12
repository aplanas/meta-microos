SUMMARY = "Devel files for libQt5XdgIconLoader"
DESCRIPTION = "Development files for QtXDG icon loader libraries used in LXQt"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libQt5XdgIconLoader-devel-3.11.0-1.2.aarch64.rpm"
RPM_HASH = "c8ccdf5df5c555e89d8204c12ded4923b07ecc294a69756d702881c90e62405efeba3e3df4da0c72e014d50e61f39683fa7cc9151706a04db69df64fb49ab3b0"

RPROVIDES:${PN} += "cmake(qt5xdgiconloader) \
libQt5XdgIconLoader-devel \
libQt5XdgIconLoader-devel(aarch-64) \
libQt5XdgIconPlugin.so()(64bit) \
pkgconfig(Qt5XdgIconLoader)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5XdgIconLoader.so.3()(64bit) \
libQt5XdgIconLoader3 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Svg)"

inherit rpm
