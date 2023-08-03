SUMMARY = "Non-ABI stable API for the Qt 6 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libQt6NetworkAuth that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-networkauth-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1dfe3a70338003fe009e03ca4a73f80d562015e001730ac689878a31b99ccd72a22e3f7c7d65cd8db96738b421860efc98fbd633ca7b519f3d6ef4b30beecb40"

RPROVIDES:${PN} += "qt6-networkauth-private-devel"

RDEPENDS:${PN} += "cmake-Qt6NetworkAuth"

inherit rpm
