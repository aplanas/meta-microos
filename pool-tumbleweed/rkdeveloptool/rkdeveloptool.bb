SUMMARY = "Utility for Rockchip SoCs"
DESCRIPTION = "rkdeveloptool provides ways to read/write rockusb devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.32~git.20210408.46bb4c0"

RPM_NAME = "rkdeveloptool-1.32~git.20210408.46bb4c0-2.9.aarch64.rpm"
RPM_HASH = "4683395882c750371e78b838de28e69de92c5b6ef634404627cd02f7401c0dee3bcabd37127a9bb7295e052a7e22c2b852e80887d26a43ee8ad7109597301dcf"

RPROVIDES:${PN} += "rkdeveloptool"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
udev"

inherit rpm
