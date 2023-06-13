SUMMARY = "Command line interface to libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains command line interface to libwebcam."
LICENSE = "GPL-3.0+"

PV = "0.2.5"

RPM_NAME = "uvcdynctrl-0.2.5-2.12.aarch64.rpm"
RPM_HASH = "b0c14e55d94ebf250462e1ca787d79ceea409ac2ed212a9236e435f21bdcd6512d9a91144527f1693e4f6ebcfbb4bc9683bc410f89e4ea182b37198fac914e34"

RPROVIDES:${PN} += "uvcdynctrl \
uvcdynctrl(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libwebcam.so.0()(64bit) \
udev"

inherit rpm
