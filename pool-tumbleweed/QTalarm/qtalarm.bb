SUMMARY = "A handy alarm clock Program written in QT"
DESCRIPTION = "A handy alarm clock Program written in QT. \
Features: \
 * Up to 15 Customization alarms \
 * Can wake up using the default sound, or any of audio / video \
   file of your choosing. \
 * Custom Date alarms"
LICENSE = "GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "QTalarm-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "a134a6fe2aea9ebb627b06bf7afabd6710d1d0b8b5f1f077bea5db9333dd66ceebe3e0a019d02fd199d654f2646904ca595ef2f26b1bb3f8c87b5ec98fd27b8b"

RPROVIDES:${PN} += "QTalarm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
