SUMMARY = "Non-ABI stable API for the Qt 6 VirtualKeyboard library"
DESCRIPTION = "This package provides private headers of libQt6VirtualKeyboard that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-virtualkeyboard-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "867b480fb697792edde62c4b8cf0810e19d55344d4557ea534828cc488b9e5e4a779da4b3adf450ee43ca9d16ad5ef29e9072e2c44735e05cb21f58d2af291c7"

RPROVIDES:${PN} += "qt6-virtualkeyboard-private-devel"

RDEPENDS:${PN} += "cmake-Qt6VirtualKeyboard \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
