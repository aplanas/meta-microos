SUMMARY = "Configuration library for fcitx5"
DESCRIPTION = "This package provides configuration libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5Config6-5.0.23-1.2.aarch64.rpm"
RPM_HASH = "a80c48313dc5f6e914d6c5af95ac0a87ee26bf7a6aefd5354e68208d24b2c83709cf62d68f4c69365b08b136807b6bd5d56c26be90a137d4e86b4dc51d0eb7df"

RPROVIDES:${PN} += "libFcitx5Config.so.6 \
libFcitx5Config5 \
libFcitx5Config6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
