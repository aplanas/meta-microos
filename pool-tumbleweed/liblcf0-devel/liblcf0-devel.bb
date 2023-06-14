SUMMARY = "RPG Maker 2000/2003 and EasyRPG game data library - development files"
DESCRIPTION = "liblcf is a library to handle RPG Maker 2000/2003 and EasyRPG game data. \
It can read and write LCF and XML files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "liblcf0-devel-0.6.2-2.12.aarch64.rpm"
RPM_HASH = "e21e5a3495fced2f7d5719fe2f538490f2a3bd029400458037ce50ec28d71a1ec1e6cd2a65de9c9c1a8daa4f37f793b3915a1156ca732297e56b6e0d867159df"

RPROVIDES:${PN} += "cmake-liblcf \
liblcf0-devel \
pkgconfig-liblcf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblcf0 \
pkgconfig-expat \
pkgconfig-icu-i18n"

inherit rpm
