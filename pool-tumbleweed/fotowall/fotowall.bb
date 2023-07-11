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

RPM_NAME = "fotowall-1.0-4.16.aarch64.rpm"
RPM_HASH = "96a17054a0046045d0099d5355654a663d3813157e457a7c826188cb6288f8f5f18e7858dc540e52ee0d5a2b7687a84f79af4f711325406adcbc03a4fbd3a5cd"

RPROVIDES:${PN} += "fotowall"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
