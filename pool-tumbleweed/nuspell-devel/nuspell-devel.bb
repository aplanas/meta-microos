SUMMARY = "Files for developing with Nuspell"
DESCRIPTION = "Header files and definitions for developing with Nuspell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.2"

RPM_NAME = "nuspell-devel-5.1.2-1.5.aarch64.rpm"
RPM_HASH = "4383f00cb36b02b24e3d0cea5984efbc7a35c99611097437348a76bf4b97df58e8472c6e9cf9576d86400134478eb423386749d522ca925bdcd7759bd2ee6f1f"

RPROVIDES:${PN} += "cmake-Nuspell \
nuspell-devel \
pkgconfig-nuspell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnuspell5 \
pkgconfig-icu-uc"

inherit rpm
