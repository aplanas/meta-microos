SUMMARY = "PDF support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PDF subplugin for LeechCraft Monocle. \
PDF support is provided via the libpoppler backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-pdf-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6b860cb076f1403f9fcb1ab3e7d2131942666a393ddd52af845595ffbbcfb0363be00d83be9d3504b0103e544b41af997b4a77d490ccca2aba2df1a705494ab7"

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
