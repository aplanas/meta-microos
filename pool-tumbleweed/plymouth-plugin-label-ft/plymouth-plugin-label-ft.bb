SUMMARY = "Plymouth FreeType label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using FreeType"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-ft-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "75738db8e32777f77053c335c00eae4f51c1edd1b539fab42228d82da60a263f3ce4f9bf22e45593539fe04d88d1d20584ff21fd0d2341fa185f4202ef41be70"

RPROVIDES:${PN} += "plymouth-plugin-label-ft"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libply-splash-core.so.5 \
libply-splash-graphics5"

inherit rpm
