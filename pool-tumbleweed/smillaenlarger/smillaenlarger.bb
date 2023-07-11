SUMMARY = "A graphical tool to resize bitmaps in high quality"
DESCRIPTION = "SmillaEnlarger is a small graphical tool ( based on Qt ) to resize, \
especially magnify bitmaps in high quality."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0+git.2017.11.21"

RPM_NAME = "smillaenlarger-0.9.0+git.2017.11.21-1.26.aarch64.rpm"
RPM_HASH = "422d822cf1edb8bb8f8298b4b4a509e2b8ac3951dfda44e005972a9e2efe9eb606b5cee0d66130b616201607077f53fb4d453e6923f7e72e8939edc0151a65e7"

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
