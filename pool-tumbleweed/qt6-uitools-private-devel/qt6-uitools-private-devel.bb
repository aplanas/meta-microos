SUMMARY = "Non-ABI stable API for the Qt 6 UiTools library"
DESCRIPTION = "This package provides private headers of libQt6UiTools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-uitools-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "bcf1b46b23dcb1a2b849f3436e63377851dd979f92062dfaee8ed8f0e74ce61cf5f32536bcaaefdfadf486ae26ca89974b8e2290ee59489ac3a164221840150d"

RPROVIDES:${PN} += "qt6-uitools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6UiTools"

inherit rpm
