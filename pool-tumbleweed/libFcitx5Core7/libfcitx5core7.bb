SUMMARY = "Core library for fcitx5"
DESCRIPTION = "This package provides core libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5Core7-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "a68cf99727e53cfbe13c2fbdbe5702d4e7e37240758af02395675ea3b3ae775a2a5db6f986b8ebe5bf9c2e55e366a6b0e45c82a26c295375c45713d8b2422f4a"

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
