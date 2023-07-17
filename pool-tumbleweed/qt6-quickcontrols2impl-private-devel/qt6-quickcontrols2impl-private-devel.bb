SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "84f858dcf732bc04ca958ecf5577fc116638fbdf45d43253bcd047cc46e263aee2d398a8e84532046be6d77eac8e5eb5d88189bf29903a1092dbf0a0a49ec4f7"

RPROVIDES:${PN} += "qt6-quickcontrols2impl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2Impl"

inherit rpm
