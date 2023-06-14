SUMMARY = "M17n input method engine for Fcitx5"
DESCRIPTION = "M17n input method engine for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-m17n-5.0.11-1.3.aarch64.rpm"
RPM_HASH = "a7181663ba78919d1c8b1e880f06d56bef666a96ca2ab8f71537f868570e6a1bba0f08e3da0e3696c1380219d854eeeba0ab537087959a5e228d4e8465d96532"

RPROVIDES:${PN} += "fcitx-m17n \
fcitx5-m17n"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm17n-core.so.0 \
libm17n.so.0 \
libstdc++.so.6 \
m17n-db"

inherit rpm
