SUMMARY = "Non-ABI stable API for the Qt 6 MultimediaWidgets Library"
DESCRIPTION = "This package provides private headers of libQt6MultimediaWidgets that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimediawidgets-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f95440e23065c5449c1c342287b75a3709e2477d2c59ee0d50e00dd95b05c098898c4c5b9bfbf1a472364a41f8a1aedfd0e801f891a339eeeba8e68b6ddaba4b"

RPROVIDES:${PN} += "qt6-multimediawidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6MultimediaWidgets \
qt6-multimedia-private-devel \
qt6-widgets-private-devel"

inherit rpm
