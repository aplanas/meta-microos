SUMMARY = "Development files for the Okteta Hex Editor"
DESCRIPTION = "Contains the development files for the Okteta Hex Editor."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "okteta-devel-0.26.13-1.1.aarch64.rpm"
RPM_HASH = "855fa48d9d4eb56021cee4e5ad82d7121ca29446094b89a887b66cc3f0f9e6a28684c29cb9ac2aaaa971ce8db80436e467714cc14cc061bf6f8f5963782e8f4d"

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
