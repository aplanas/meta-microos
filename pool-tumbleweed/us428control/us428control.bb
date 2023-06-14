SUMMARY = "Sound Blaster 16 ASP/CSP control program"
DESCRIPTION = "This package contains a control tool for Tascam US-X2Y audio devices"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "us428control-0.4.6-24.3.aarch64.rpm"
RPM_HASH = "753c34a843f91873a4bebf79e456ec9da7b75219659c4b8c79fa457f085169de20d335d646afe29b33eaac05d9f2dcb4f45710ff614146e7b2db78008e2e41bc"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/us428control \
us428control"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
