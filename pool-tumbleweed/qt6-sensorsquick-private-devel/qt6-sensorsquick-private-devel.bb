SUMMARY = "Non-ABI stable API for the Qt 6 SensorsQuick library"
DESCRIPTION = "This package provides private headers of libQt6SensorsQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensorsquick-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "30ebe626c93d7a4365d72117606fdcb6bddc769d13da9132466da456c95ecfdaa85df0ab45346c1985ca2c7e2ea30f55288682ed485bd265d499618b805de9ab"

RPROVIDES:${PN} += "qt6-sensorsquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SensorsQuick"

inherit rpm
