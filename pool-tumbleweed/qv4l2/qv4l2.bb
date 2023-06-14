SUMMARY = "Video4linux test control and streaming test application"
DESCRIPTION = "qv4l2 is a test control and streaming test application for video4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.24.1"

RPM_NAME = "qv4l2-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "5cd52abd6e0f7bd68f2dd74b8c6811e2be905bc77f8baf711f407ec498cf431e4c5e2d977df220960b5c6070fa1ad5152c8ecb13abf7925a9ea5394bce69c4be"

RPROVIDES:${PN} += "qv4l2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libv4l \
libv4l2.so.0 \
libv4lconvert.so.0"

inherit rpm
