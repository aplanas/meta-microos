SUMMARY = "A graphical tool to resize bitmaps in high quality"
DESCRIPTION = "SmillaEnlarger is a small graphical tool ( based on Qt ) to resize, \
especially magnify bitmaps in high quality."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0+git.2017.11.21"

RPM_NAME = "smillaenlarger-0.9.0+git.2017.11.21-1.25.aarch64.rpm"
RPM_HASH = "d13bfb5e3057431eda8390c7b893e25e329f541b1acb187bb73dccf3d63a52894b61542a6a8e75a12608c89444e55ac40c11daa034fea5487fc46ec48c3f205f"

RPROVIDES:${PN} += "application() \
application(smilla.desktop) \
mimehandler(application/x-smilla) \
mimehandler(image/bmp) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
smillaenlarger \
smillaenlarger(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
