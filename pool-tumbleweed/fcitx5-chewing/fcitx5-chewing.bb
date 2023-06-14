SUMMARY = "Chewing Wrapper for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-chewing-5.0.14-1.1.aarch64.rpm"
RPM_HASH = "b821fc76e4e217067d18bf9e3e3c06d32860e7139bf1d9d3a7b7711f2ea7d92b066f0980583af35d4f7a24d4a4f830c6f51113bc557d9559a1de9ecd8d52eb94"

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
