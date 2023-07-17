SUMMARY = "Qt 6 RemoteObjects Tools"
DESCRIPTION = "This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-tools-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bec505ef55885321e937bb16e8f959f343f1571aac5ffc7dabb8f9c5b58865f2eefaf34565f480870eb3b33f75a0affdcb2b47725939062d77fb00927ee0db56"

RPROVIDES:${PN} += "qt6-remoteobjects-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
