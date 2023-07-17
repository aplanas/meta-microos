SUMMARY = "Qt 6 Bodymovin library"
DESCRIPTION = "The Qt 6 Bodymovin library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Bodymovin6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b7bcdbd82b455df04ef0fafa1b676ce48e72b9566b9c241f11fef8ae538e3e4b6eadd55cf0cfdf11ceeab067dbed61969c6aaa0268a8650f8d629e8ed8e2e45c"

RPROVIDES:${PN} += "libQt6Bodymovin.so.6 \
libQt6Bodymovin6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
