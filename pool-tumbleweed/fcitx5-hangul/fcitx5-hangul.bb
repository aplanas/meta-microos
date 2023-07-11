SUMMARY = "Hangul Wrapper for Fcitx5"
DESCRIPTION = "Hangul Wrapper for Fcitx5."
LICENSE = "LGPL-2.1-only"

PV = "5.0.11"

RPM_NAME = "fcitx5-hangul-5.0.11-1.2.aarch64.rpm"
RPM_HASH = "de32cdd12d1f84f4349bb5cd55410cae89bb25845d1e900f977f7898dd0b291c8f3d50c245ef3cb5c154a49fb012b8d2f9a6e1299f9373f56fc6ad00558ffbc0"

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
