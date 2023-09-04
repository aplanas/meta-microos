SUMMARY = "Qt 6 CUPS plugin"
DESCRIPTION = "The Qt printsupport CUPS plugin."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-printsupport-cups-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c5b4edf2d4e784e5b8ce68edd4b86747496b9e6591734790823c458fc0a024a1282684dd537b0400045b2601e7911797da603d64e2380ac2f4d51c4e643af0b9"

RPROVIDES:${PN} += "libcupsprintersupport.so \
qt6-printsupport-cups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6PrintSupport6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcups.so.2 \
libstdc++.so.6"

inherit rpm
