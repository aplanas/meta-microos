SUMMARY = "The main Qt-frontend synthesiser application"
DESCRIPTION = "It facilitates both realtime synthesis and conversion of pre-recorded SMF files to WAVE making use of the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "mt32emu-qt-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "9f6b3447eee82024fdc9b91ae2e62ca2b83a71f45fcb5343346409b5fbccfe5ffccd3e0fb6e450b75bd6739dd58645aa9f65e07a63009a0105d0866a5950397d"

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
