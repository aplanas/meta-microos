SUMMARY = "Non-ABI stable API for the Qt 6 WaylandClient library"
DESCRIPTION = "This package provides private headers of libQt6WaylandClient that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandclient-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "81248f64196a2b49b1378c728ae082ea87d8c0b08abed2fbd1beeb0bc86c30a874632de876eadaec21d09d39ac44754ceb4d9fdfecc0e2406479e357607a865e"

RPROVIDES:${PN} += "qt6-waylandclient-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandClient"

inherit rpm
