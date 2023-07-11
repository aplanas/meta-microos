SUMMARY = "Development files for the Okteta Hex Editor"
DESCRIPTION = "Contains the development files for the Okteta Hex Editor."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.11"

RPM_NAME = "okteta-devel-0.26.11-1.1.aarch64.rpm"
RPM_HASH = "b5a6e66767d3cedc6370aef41b10a466ccbe6aeed5c521c94b387d94ba42f8b8a65f865f9b02322e93982f4ede1c788ed05fdeea3143c98681f37daf8af18e61"

RPROVIDES:${PN} += "cmake-KastenControllers \
cmake-KastenCore \
cmake-KastenGui \
cmake-OktetaCore \
cmake-OktetaGui \
cmake-OktetaKastenControllers \
cmake-OktetaKastenCore \
cmake-OktetaKastenGui \
okteta-devel \
pkgconfig-OktetaCore \
pkgconfig-OktetaGui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libKasten4 \
libOkteta3 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-OktetaCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Widgets"

inherit rpm
