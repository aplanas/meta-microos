SUMMARY = "Hangul Wrapper for Fcitx5"
DESCRIPTION = "Hangul Wrapper for Fcitx5."
LICENSE = "LGPL-2.1-only"

PV = "5.1.0"

RPM_NAME = "fcitx5-hangul-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "c84fb1f900e669bc421d112c057a3d3438996d4339e93b4c463501b8f3200aa6574ee1cd4953b6ae19ecab38bd3bdf3fa1cc237270b724c2f2fe9307d281877c"

RPROVIDES:${PN} += "fcitx-hangul \
fcitx5-hangul"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libhangul.so.1 \
libstdc++.so.6"

inherit rpm
