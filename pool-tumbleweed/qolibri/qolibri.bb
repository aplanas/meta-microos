SUMMARY = "EPWING Dictionary Viewer"
DESCRIPTION = "qolibri is a dictionary viewer for the proprietary EPWING dictionary format \
(originally developed for electronic pocket dictionaries). Most monolingual \
Japanese dictionaries can only be found in the EPWING format."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "qolibri-2.1.4-1.9.aarch64.rpm"
RPM_HASH = "48eca80649b880cf4a81e964eccad6b2d99143431aa4015197eba49d94f363ace59eec5a06a5ad70798bbd20ea2d7c6cf569e2eac66e4f18c06d2f4171b6372b"

RPROVIDES:${PN} += "qolibri"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libeb.so.16 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
