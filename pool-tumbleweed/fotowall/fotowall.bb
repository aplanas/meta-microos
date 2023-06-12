SUMMARY = "A wallpaper generator"
DESCRIPTION = "FotoWall is a wallpaper generator rendering pictures \
in a high resolution composition. \
 \
The interface offers functionality such as: \
- drag multiple pictures inside fotowall \
- use the red button on the lower rigt corner to resize the picture \
- use the green button on the lower right corner to rotate the picture \
- press the 'del' button after selecting a picture to remove it from the composition \
- move the mouse on the corners to change various colors in an extremely cool way"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & BSD-2-Clause"

PV = "1.0"

RPM_NAME = "fotowall-1.0-4.15.aarch64.rpm"
RPM_HASH = "3788c55416fccceaadc221cb6d2005a5354c30e6735f62069c882845d967abb48c394eb900cd18b340eea6bc2f82ab63d6773e0607f09b862d50b73f9ecebc19"

RPROVIDES:${PN} += "application() \
application(fotowall.desktop) \
fotowall \
fotowall(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
