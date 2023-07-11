SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "018f0698ad53b98f9624a26b7820697ddec75341448dd794cf98bf3d16ca839c1f97cbf741dce8f16d5c158a157e93f8e88ab38ae40a8ce33742636a8404c8b8"

RPROVIDES:${PN} += "cmake-Qt6Pdf \
pkgconfig-Qt6Pdf \
qt6-pdf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Pdf6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
