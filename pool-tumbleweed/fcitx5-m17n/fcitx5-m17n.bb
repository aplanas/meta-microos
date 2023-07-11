SUMMARY = "M17n input method engine for Fcitx5"
DESCRIPTION = "M17n input method engine for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-m17n-5.0.11-1.4.aarch64.rpm"
RPM_HASH = "61870d24d08e6c3fb4fa94a50983978ca0a5a19df17cec13895d45a0192a29960b76f43d3175d13f33ff9ceee036f31e53805d1c2c68e60f58ba29a2cd645eff"

RPROVIDES:${PN} += "fcitx-m17n \
fcitx5-m17n"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm17n-core.so.0 \
libm17n.so.0 \
libstdc++.so.6 \
m17n-db"

inherit rpm
