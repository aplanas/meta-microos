SUMMARY = "Development files for the Okteta Hex Editor"
DESCRIPTION = "Contains the development files for the Okteta Hex Editor."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.12"

RPM_NAME = "okteta-devel-0.26.12-1.1.aarch64.rpm"
RPM_HASH = "d8ca9222eff7f5a27c7c4bd3c68ccfe3485e88abd49e27a14614f7aaa1204e176ba33dc8d80ca6dd361bca43d4a8c33bb6f3ee4eec3801efdc9956d7451525ad"

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
