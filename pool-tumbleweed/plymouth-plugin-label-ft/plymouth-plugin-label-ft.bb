SUMMARY = "Plymouth FreeType label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using FreeType"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-ft-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "2b592acd6644359633d56107c47d86c4f777b70ba7a8c5ddc76c8f7d77206d4f3590ba31232d595790f9559a6e9fc59e83a50f6a1a791ca40c8a2636df9910e3"

RPROVIDES:${PN} += "plymouth-plugin-label-ft"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libply-splash-core.so.5 \
libply-splash-graphics5"

inherit rpm
