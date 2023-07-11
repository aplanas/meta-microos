SUMMARY = "RIME support for Fcitx5"
DESCRIPTION = "This package provides RIME support for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-rime-5.0.16-1.2.aarch64.rpm"
RPM_HASH = "4b291c0705d333c07d15710b5c216a5f41f323971654f459ad5ff6be265154c73ac46072f6dbcf1dda7eb09f75e5789ff1af280b3a3950b15f1dcdbc075ebf38"

RPROVIDES:${PN} += "fcitx-rime \
fcitx5-rime"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
librime.so.1 \
libstdc++.so.6 \
rime"

inherit rpm
