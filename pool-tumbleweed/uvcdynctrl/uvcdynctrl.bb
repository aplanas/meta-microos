SUMMARY = "Command line interface to libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains command line interface to libwebcam."
LICENSE = "GPL-3.0+"

PV = "0.2.5"

RPM_NAME = "uvcdynctrl-0.2.5-3.1.aarch64.rpm"
RPM_HASH = "3fc9b9f502c947b4a03f6ae319c4bd619118891074df637dda406e9000b4caeeac3d164b02d2f0caf09ad7357f603153df3eb7d3360fdd93133bcb76762499d0"

RPROVIDES:${PN} += "uvcdynctrl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwebcam.so.0 \
udev"

inherit rpm
