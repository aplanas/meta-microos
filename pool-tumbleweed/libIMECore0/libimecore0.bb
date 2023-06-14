SUMMARY = "Core library for libime"
DESCRIPTION = "This package provides core library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libIMECore0-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "8ff5f26dbce0f6272edc385593b97910aab752850d8165cf2e385f56ac032a66eb29419f2405615feec05238adaec40cee8498a249e02d3f65828b05713e71f9"

RPROVIDES:${PN} += "libIMECore.so.0 \
libIMECore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libime-tools \
libm.so.6 \
libstdc++.so.6"

inherit rpm
