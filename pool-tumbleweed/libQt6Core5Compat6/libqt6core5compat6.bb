SUMMARY = "Qt 6 Core 5 Compat library"
DESCRIPTION = "The Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Core5Compat6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1e44503c0d99e303bcdce88e6f665662f36ba8da7b47317be6cba900b64dde8a77ccd264847732a2ebb17e2dd919be9ca03ec018f004a1c578882866bd71faec"

RPROVIDES:${PN} += "libQt6Core5Compat.so.6()(64bit) \
libQt6Core5Compat.so.6(Qt_6)(64bit) \
libQt6Core5Compat6 \
libQt6Core5Compat6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
