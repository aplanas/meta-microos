SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebView6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ac3ababc9afa4409dc8f55c4f25c9b01fdbd42f9766ea54a6ed962db037d43c2236f47d77e7b245c731e40700e274db3d5c29fe3cec79f7144d95760c1cee4ae"

RPROVIDES:${PN} += "libQt6WebView.so.6 \
libQt6WebView6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
