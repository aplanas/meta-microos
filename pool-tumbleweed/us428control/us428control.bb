SUMMARY = "Sound Blaster 16 ASP/CSP control program"
DESCRIPTION = "This package contains a control tool for Tascam US-X2Y audio devices"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "us428control-0.4.6-24.4.aarch64.rpm"
RPM_HASH = "32bb80640484b4f7bfb4baf55ebcb8857073aa32bc98066f090e04df408c7bba572b7559162cf3992cef2f3e293c7eee4e3c57fb0c45a96de3bc35501c36490f"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/us428control \
us428control"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
