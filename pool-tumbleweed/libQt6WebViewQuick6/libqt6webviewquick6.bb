SUMMARY = "Qt 6 WebViewQuick library"
DESCRIPTION = "The Qt6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebViewQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5bf11773f92518f8b1042bdd6ba619a20b95fe2c48ef14b5c47f859cbd1653133b7390dc9fae3c6e953ecc1212fab476a9ce5ca586c0f16f2132d20433faf3b7"

RPROVIDES:${PN} += "libQt6WebViewQuick.so.6 \
libQt6WebViewQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebView.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
