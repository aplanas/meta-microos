SUMMARY = "Non-ABI stable API for the Qt 6 MultimediaWidgets Library"
DESCRIPTION = "This package provides private headers of libQt6MultimediaWidgets that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediawidgets-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fbd4799e623e48988fb4d1d55eb6a9e1c69cf99c371bdcc701906623f33cdc520ec52798697d893a296d42bd8a123515f9db8b7b59be87aa63451da64761647c"

RPROVIDES:${PN} += "qt6-multimediawidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6MultimediaWidgets \
qt6-multimedia-private-devel \
qt6-widgets-private-devel"

inherit rpm
