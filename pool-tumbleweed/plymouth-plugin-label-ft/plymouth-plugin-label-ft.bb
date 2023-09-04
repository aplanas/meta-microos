SUMMARY = "Plymouth FreeType label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using FreeType"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-ft-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "33c74558262141ffd161749eb4cca7ea342ab7bb3d36eee07fd2c2bd863494f11d65b053178d574212b51ba7418d0f6e6a676f43d7c6c9abc066001a12bceaed"

RPROVIDES:${PN} += "plymouth-plugin-label-ft"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libply-splash-core.so.5 \
libply-splash-graphics5"

inherit rpm
