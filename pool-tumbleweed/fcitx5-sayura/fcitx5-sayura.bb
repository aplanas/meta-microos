SUMMARY = "Sinhala input method for Fcitx5"
DESCRIPTION = "Fcitx5-Sayura is a Sinhala input method for Fcitx5 input method framework ported from IBus-Sayura."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.6"

RPM_NAME = "fcitx5-sayura-5.0.6-1.7.aarch64.rpm"
RPM_HASH = "6e9e9baf079e801727e3d37d80e1e7c7000b9598222894e4f4673d89fd0cfa7a0feb5ec61e3f919f3194ccd61e42f722ef22d5c0338ba375e5892a073962cc68"

RPROVIDES:${PN} += "fcitx-sayura \
fcitx5-sayura"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
