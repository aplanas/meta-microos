SUMMARY = "Core library for fcitx5"
DESCRIPTION = "This package provides core libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5Core7-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "5c05c403c7695d83f16024ad4b29c0df352478ac7b9e8516437e6935d45b09e6612e7130532fc85d86ba4668536377dd9a488fbb4c3aec828efa9f306a5c7736"

RPROVIDES:${PN} += "libFcitx5Core.so.7()(64bit) \
libFcitx5Core5 \
libFcitx5Core7 \
libFcitx5Core7(aarch-64) \
libfcitx-4_2_9 \
libfcitx-core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
