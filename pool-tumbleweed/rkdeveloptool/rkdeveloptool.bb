SUMMARY = "Utility for Rockchip SoCs"
DESCRIPTION = "rkdeveloptool provides ways to read/write rockusb devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.32~git.20210408.46bb4c0"

RPM_NAME = "rkdeveloptool-1.32~git.20210408.46bb4c0-2.8.aarch64.rpm"
RPM_HASH = "1b1ca63264cd411775001ae6b1b45a1879e426638b1238d334213b0cb25eded78eab36edea4758c8cedd35a528b3074803481a765b614502e029ba38fdd9feef"

RPROVIDES:${PN} += "rkdeveloptool"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
udev"

inherit rpm
