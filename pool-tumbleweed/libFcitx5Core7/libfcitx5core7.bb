SUMMARY = "Core library for fcitx5"
DESCRIPTION = "This package provides core libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5Core7-5.0.23-1.2.aarch64.rpm"
RPM_HASH = "b87e146c9186101c01a2b2202385e1faf24462f8622fc5da53b193748742bfb7b6125a7a983d0fc80d6235766269c03f16c617634e77c68319966a4a5d675c36"

RPROVIDES:${PN} += "libFcitx5Core.so.7 \
libFcitx5Core5 \
libFcitx5Core7 \
libfcitx-4-2-9 \
libfcitx-core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1 \
libxkbcommon.so.0"

inherit rpm
