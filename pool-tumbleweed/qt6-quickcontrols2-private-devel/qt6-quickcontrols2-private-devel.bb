SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "968e54f33fc92b76034e497f8ac03c2ecaf4515bb6066ee6db8f8231ac234f22809a35526ab8dac149ffb1b1a773e067c48c4daa04e04d8b04760a73c8e7176f"

RPROVIDES:${PN} += "qt6-quickcontrols2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2"

inherit rpm
