SUMMARY = "Qt 6 LanguageServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 LanguageServer private library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-languageserver-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "befc53d4066a9c7e241387374bca80a738f3b544c140a357832228548823327353f84bc91b48bf26251425dbda9f945c4669f177bc833941c4439552b1d187c0"

RPROVIDES:${PN} += "cmake-Qt6LanguageServerPrivate \
qt6-languageserver-private-devel"

RDEPENDS:${PN} += "libQt6LanguageServer6 \
qt6-core-private-devel \
qt6-jsonrpc-private-devel"

inherit rpm
