SUMMARY = "Qt 6 3DExtras library"
DESCRIPTION = "The Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DExtras6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e6a1bfb8ddb6f018463b842185b6e00c872781a95d2e76d414f336bc4b27dcce00e1a8875018d771c460a21d787336ffa00636abb52cf4b6a2216c5c30611336"

RPROVIDES:${PN} += "libQt63DExtras.so.6 \
libQt63DExtras6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
