SUMMARY = "A graphical tool to resize bitmaps in high quality"
DESCRIPTION = "SmillaEnlarger is a small graphical tool ( based on Qt ) to resize, \
especially magnify bitmaps in high quality."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0+git.2017.11.21"

RPM_NAME = "smillaenlarger-0.9.0+git.2017.11.21-1.25.aarch64.rpm"
RPM_HASH = "d13bfb5e3057431eda8390c7b893e25e329f541b1acb187bb73dccf3d63a52894b61542a6a8e75a12608c89444e55ac40c11daa034fea5487fc46ec48c3f205f"

RPROVIDES:${PN} += "smillaenlarger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
