SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WebView6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5c3b7d8fd1381bb61dfa49d3aefe9f73b2a6bc4393a78717e9849a74e405ca72b20b181699b84d242a27a5d0f8f04f599c9158a84354dfc2bb7263492b6543a4"

RPROVIDES:${PN} += "libQt6WebView.so.6 \
libQt6WebView6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
