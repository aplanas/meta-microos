SUMMARY = "Chewing Wrapper for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-chewing-5.0.14-1.2.aarch64.rpm"
RPM_HASH = "e3fc07ed8de9a19af1cb59bc23262274853d1207fe5056d6168a4736d11427b3c28261b72a5d335dfa1a411354a776b052e61685891c8f70db87a40967b31d47"

RPROVIDES:${PN} += "fcitx-chewing \
fcitx5-chewing \
libchewing.so"

RDEPENDS:${PN} += "chewing-data \
chewing-utils \
fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libchewing.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
