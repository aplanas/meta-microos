SUMMARY = "Qt 6 RemoteObjects Tools"
DESCRIPTION = "This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-tools-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "305b4865a5275acd9b41374c777769870a53fd65f85c6dbfaffb1fcc65d41eac2063b246e9780297f567edcdeb9e6f3a2ddb609903bafa93d603ff8c6062aa05"

RPROVIDES:${PN} += "qt6-remoteobjects-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
