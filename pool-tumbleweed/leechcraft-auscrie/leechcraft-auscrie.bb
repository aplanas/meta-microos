SUMMARY = "LeechCraft Screenshooter Module"
DESCRIPTION = "This package provides a LeechCraft plugin to make screenshots of \
LeechCraft and then either save them locally or upload them to an \
imagebin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-auscrie-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "00ebdc615b2863d528212bc233f57850a39e8e7ade91e96fcf207a9b6446d9e57c098beb0e6589499c338cc84ea364d18e146235b0002383238f5e3de4234a07"

RPROVIDES:${PN} += "leechcraft-auscrie \
libleechcraft-auscrie.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-imgaste \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
