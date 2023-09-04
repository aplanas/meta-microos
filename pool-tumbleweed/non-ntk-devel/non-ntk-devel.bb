SUMMARY = "Development files for non-ntk"
DESCRIPTION = "This package contains development files for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-devel-1.3.1001-2.1.aarch64.rpm"
RPM_HASH = "3f249d4612b396d7d559000cb96b12d52f2bf2eeb6a7e5a3e32a4c69a6a5dc063728595789815fb52ef2fde720c3fddc447a9b0bff3296a93febe22e1254e144"

RPROVIDES:${PN} += "non-ntk-devel \
pkgconfig-ntk \
pkgconfig-ntk-gl \
pkgconfig-ntk-images"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntk1 \
pkgconfig-cairo \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xft"

inherit rpm
