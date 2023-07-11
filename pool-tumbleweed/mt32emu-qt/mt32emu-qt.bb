SUMMARY = "The main Qt-frontend synthesiser application"
DESCRIPTION = "It facilitates both realtime synthesis and conversion of pre-recorded SMF files to WAVE making use of the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "mt32emu-qt-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "f760eb053f4e99a42083f2b35604b1f4fe21d60b01c280f7d73a6d7f8e4f6d5af1d57888a878b79ee3fd1dcadc8b34a0818f5050dfae9e796a39e26bd72f1b87"

RPROVIDES:${PN} += "mt32emu \
mt32emu-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libmt32emu.so.2 \
libmt32emu2 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
