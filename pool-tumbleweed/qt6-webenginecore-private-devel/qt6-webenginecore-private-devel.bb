SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginecore-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "850a7f53603699cc1d0cf6fe6461fa4d03b9c4523a290d4da83512ed83f4f0923689104442c0fb507365e202aca7d10723d66fb45bb489b31485abbdd6dd901d"

RPROVIDES:${PN} += "qt6-webenginecore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineCore"

inherit rpm
