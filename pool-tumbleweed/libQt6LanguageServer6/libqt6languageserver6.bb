SUMMARY = "LSP implementation for Qt6"
DESCRIPTION = "The Qt 6 LanguageServer library implements the Language Server Protocol (LSP) \
specification."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6LanguageServer6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c019ab461c71cda57d6d7402e648620ae28122cec5cb381ee8b3b01ef479d5670b3a0a751def3c8b4a19c7199526900af4961ea22effd0780d190ba0a665c9eb"

RPROVIDES:${PN} += "libQt6LanguageServer.so.6 \
libQt6LanguageServer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6JsonRpc.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
