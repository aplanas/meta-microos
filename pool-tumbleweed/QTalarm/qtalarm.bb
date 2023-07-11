SUMMARY = "A handy alarm clock Program written in QT"
DESCRIPTION = "A handy alarm clock Program written in QT. \
Features: \
 * Up to 15 Customization alarms \
 * Can wake up using the default sound, or any of audio / video \
   file of your choosing. \
 * Custom Date alarms"
LICENSE = "GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "QTalarm-2.4.0-1.3.aarch64.rpm"
RPM_HASH = "3467a9d7fda3257b0efba550cda709e023dd43f71d5d27ea748c8fe64aced4a4feb8550f4205a0d8d9552e9e218b837a6aa42a79ba065fbd10fcd3ca115e08fa"

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
