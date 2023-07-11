SUMMARY = "Non-ABI stable API for the Qt 6 QmlCore library"
DESCRIPTION = "This package provides private headers of libQt6QmlCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcore-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "f50b8550c9d2938375f03d7fae7d8c4eaabd6545c06ab98005953b28077c25f8a003bc8afcfe7c798178ee6cb5272cacc5b2fdfdad4f0f58effdf37fff8f8cc1"

RPROVIDES:${PN} += "qt6-qmlcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCore"

inherit rpm
