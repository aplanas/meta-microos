SUMMARY = "Qt 6 Positioning library"
DESCRIPTION = "The Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Positioning6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b03aa02a95805aacf7d5edc1e406b6d8fd000e9d33fd275ec87b0b9adfa456e10c8199e1a787e7c923ec0fee0062654a66c312e3cd4e4a68723f26a60ab8e8e6"

RPROVIDES:${PN} += "libQt6Positioning.so.6 \
libQt6Positioning6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
