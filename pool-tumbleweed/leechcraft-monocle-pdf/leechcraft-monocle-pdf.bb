SUMMARY = "PDF support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PDF subplugin for LeechCraft Monocle. \
PDF support is provided via the libpoppler backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-pdf-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b775a84bbcd56adff63c819a2024898f222f5780613c539dab8f2ab28907780c7049cdcb0ec1db7ea2fde7915388e00d63ab6b9ed2a42abd68e62da7a02ee4b8"

RPROVIDES:${PN} += "leechcraft-monocle-pdf \
leechcraft-monocle-subplugin \
libleechcraft-monocle-pdf.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libpoppler-qt5.so.1 \
libstdc++.so.6"

inherit rpm
