SUMMARY = "The main Qt-frontend synthesiser application"
DESCRIPTION = "It facilitates both realtime synthesis and conversion of pre-recorded SMF files to WAVE making use of the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "mt32emu-qt-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "9f6b3447eee82024fdc9b91ae2e62ca2b83a71f45fcb5343346409b5fbccfe5ffccd3e0fb6e450b75bd6739dd58645aa9f65e07a63009a0105d0866a5950397d"

RPROVIDES:${PN} += "application() \
application(mt32emu-qt.desktop) \
mt32emu \
mt32emu-qt \
mt32emu-qt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libmt32emu.so.2()(64bit) \
libmt32emu2 \
libportaudio.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
