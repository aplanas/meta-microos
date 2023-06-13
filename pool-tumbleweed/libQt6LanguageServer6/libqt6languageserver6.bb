SUMMARY = "LSP implementation for Qt6"
DESCRIPTION = "The Qt 6 LanguageServer library implements the Language Server Protocol (LSP) \
specification."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6LanguageServer6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dbe4af01f0f873d39582923878d698746ddf2010c0952c4d30ecb445a2a501ba75cc5418a8b59b80f08fc726188ef2881ee4f6b7700a6a2dd467be772b5de9ea"

RPROVIDES:${PN} += "libQt6LanguageServer.so.6()(64bit) \
libQt6LanguageServer.so.6(Qt_6)(64bit) \
libQt6LanguageServer6 \
libQt6LanguageServer6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6JsonRpc.so.6()(64bit) \
libQt6JsonRpc.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
