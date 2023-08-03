SUMMARY = "Qt 6 LanguageServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 LanguageServer private library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-languageserver-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "700da72ef1cbe4a61ab89642760fe07381654b66dbe0f61cc9ae8cf2a60ab8aa6e57d0b5f827dd2a757d9ca3ae82996b6d01d63db8307dbb5f248f7f79d1738a"

RPROVIDES:${PN} += "cmake-Qt6LanguageServerPrivate \
qt6-languageserver-private-devel"

RDEPENDS:${PN} += "libQt6LanguageServer6 \
qt6-core-private-devel \
qt6-jsonrpc-private-devel"

inherit rpm
