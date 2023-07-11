SUMMARY = "Core library for libime"
DESCRIPTION = "This package provides core library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libIMECore0-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "404e761ee6e2fcd8bcfa4b466e6bb969649c110ae4d0da484ae378375f206036f0510fa76df824f6f3db1e18ef875dab51f8b4f2f094dc3df64684fdc83b172e"

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
