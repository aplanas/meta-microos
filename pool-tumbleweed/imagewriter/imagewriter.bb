SUMMARY = "Utility for writing disk images to USB keys"
DESCRIPTION = "A graphical utility for writing raw disk images & hybrid ISOs to USB keys."
LICENSE = "GPL-2.0-only"

PV = "1.10.1432200249.1d253d9"

RPM_NAME = "imagewriter-1.10.1432200249.1d253d9-2.13.aarch64.rpm"
RPM_HASH = "15718c8d951a06041a061931fef6793eb33a4189edb0f6c82219c7434a6cf81bacbffec24c4845e2649485898b4f3cc56d1732e41deb7445fe18f0ed103f53d8"

RPROVIDES:${PN} += "imagewriter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xdg-utils"

inherit rpm
