SUMMARY = "Command line interface to libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains command line interface to libwebcam."
LICENSE = "GPL-3.0+"

PV = "0.2.5"

RPM_NAME = "uvcdynctrl-0.2.5-2.13.aarch64.rpm"
RPM_HASH = "fb8a61973caaff8980f8608390a366047102a5fda20ec6133afc371ef7da0aece2186fdd90d33f912341c1079017fb7b3d255128fb57ebfedf5be48d3ac22b0d"

RPROVIDES:${PN} += "uvcdynctrl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwebcam.so.0 \
udev"

inherit rpm
