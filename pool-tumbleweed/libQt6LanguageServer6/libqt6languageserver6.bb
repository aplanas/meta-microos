SUMMARY = "LSP implementation for Qt6"
DESCRIPTION = "The Qt 6 LanguageServer library implements the Language Server Protocol (LSP) \
specification."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6LanguageServer6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a952de21bd3f637e91e785a1c872841fb7d398ae115915cb297c662fd3dbc0fb25dd810e14573e065b7e0d17d1d398582e0f04e99721840c15e092e8f2f67829"

RPROVIDES:${PN} += "libQt6LanguageServer.so.6 \
libQt6LanguageServer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6JsonRpc.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
