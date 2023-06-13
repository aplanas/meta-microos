SUMMARY = "Utilities for video4linux"
DESCRIPTION = "v4l-utils is a collection of various video4linux (V4L) utilities."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "v4l-utils-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "86311ab480b81b4754ad52c7b306805ae812081214321803814fcb6a598383323209be1ad02539319d2976573f41e5527ac95f5be93dd9f44ae12da4188b827a"

RPROVIDES:${PN} += "config(v4l-utils) \
v4l-utils \
v4l-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libv4l \
libv4l2.so.0()(64bit) \
libv4l2rds.so.0()(64bit)"

inherit rpm
