SUMMARY = "Non-ABI stable API for the Qt 6 UiTools library"
DESCRIPTION = "This package provides private headers of libQt6UiTools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-uitools-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0692e9429a213a2a523eb4eacf5061e56d99732f7e88a66a5831d4803dfbc03781069fd230dc308fd99e004e901d25a7895b6f21a39b40d8b42a175e4c16fadb"

RPROVIDES:${PN} += "qt6-uitools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6UiTools"

inherit rpm
