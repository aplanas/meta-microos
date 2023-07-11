SUMMARY = "Libthai input method engine for Fcitx5"
DESCRIPTION = "fcitx-libthai is an input method engine for Fcitx, which uses libthai as its backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-libthai-5.0.11-1.4.aarch64.rpm"
RPM_HASH = "ccf05b5fa33b555cf5d31342a0b8f4eb6447323ef915609fbb523bce18c19213dc73c959a3d5b71099cd64bd9eafd51552535263a72e16982c865a2a4d30a6a6"

RPROVIDES:${PN} += "fcitx5-libthai \
libthai.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libthai-data \
libthai.so.0"

inherit rpm
