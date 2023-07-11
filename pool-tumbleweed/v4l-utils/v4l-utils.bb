SUMMARY = "Utilities for video4linux"
DESCRIPTION = "v4l-utils is a collection of various video4linux (V4L) utilities."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "v4l-utils-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "79bdb8b90730ce2125c2d381f69ab26b81406c4db6b51ade223e8d43eb36c5caaf17edbda3110563e3d488a526be24a69bb1a420cd2ccc682a73d4d6cb96879b"

RPROVIDES:${PN} += "config-v4l-utils \
v4l-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libv4l \
libv4l2.so.0 \
libv4l2rds.so.0"

inherit rpm
