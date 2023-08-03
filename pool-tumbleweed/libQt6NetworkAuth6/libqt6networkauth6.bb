SUMMARY = "Qt 6 NetworkAuth library"
DESCRIPTION = "The Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "libQt6NetworkAuth6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f0e9c14a56682e581beb9723702e316a6b47ed2f9d39ed0f339669f2784d487ca6716362e928b975c79d1def18e76c7850cfb980950b6bd1463a25f0b1f8eca0"

RPROVIDES:${PN} += "libQt6NetworkAuth.so.6 \
libQt6NetworkAuth6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
