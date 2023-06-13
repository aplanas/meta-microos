SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfquick-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7fbf51f68f1f1dd0404bffea33144629d55c36f041fb9cc20c47007e431ae1f458e223762587de918b395f23e0a2844600afbd5871c33b22d895783d66fba83b"

RPROVIDES:${PN} += "cmake(Qt6PdfQuick) \
pkgconfig(Qt6PdfQuick) \
qt6-pdfquick-devel \
qt6-pdfquick-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6Qml) \
libQt6PdfQuick6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Pdf) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
qt6-pdf-private-devel \
qt6-quick-private-devel"

inherit rpm
