SUMMARY = "RIME support for Fcitx5"
DESCRIPTION = "This package provides RIME support for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "fcitx5-rime-5.1.1-1.1.aarch64.rpm"
RPM_HASH = "19b8d8a77280c26fb20ff1bbcd15582929b09a48dbdfe835a55e47e700fbd5e1cc419506f0ae8e99da803009f113021fd7171da96c586e46574d5deea9a76594"

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
