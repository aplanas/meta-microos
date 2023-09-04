SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdf-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "b08afec44c6d280391538d0ab59475de6e163914c2165571cf71ef7fcf9734629f693bb48e216a19785222e8d7c4ba06ff20d03e38d842038d886d19120d70af"

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
