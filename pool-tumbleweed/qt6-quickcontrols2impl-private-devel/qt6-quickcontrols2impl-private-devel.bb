SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "24cc04a5737e7ed7ac41bc10abe8bfd2841098d47adbdf45abec8eecff584a7ea489c1a27bc186cbe9a99c8f82fe18bf45e59390da60f8e9de376ab272a1219c"

RPROVIDES:${PN} += "qt6-quickcontrols2impl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2Impl"

inherit rpm
