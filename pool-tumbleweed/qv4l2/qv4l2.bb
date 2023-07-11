SUMMARY = "Video4linux test control and streaming test application"
DESCRIPTION = "qv4l2 is a test control and streaming test application for video4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.24.1"

RPM_NAME = "qv4l2-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "5e5de25593798922563de167ab3650b9582370acc4a7229321f2c49bdf7cace0cf565a1adf5aca1c12fe76b863103a9890ca18d04320c8d35c31ddf61d80dd64"

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
