SUMMARY = "Non-ABI stable API for the Qt 6 HttpServer Library"
DESCRIPTION = "This package provides private headers of libQt6HttpServer that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-httpserver-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a0eb7c7b33f4afdb9c0926491ed7d193d291970533f6687466727a9b5b713a411a9e82af304a95eb51079e8c7a664f7f2859ad69dd8c868f017819549f10476e"

RPROVIDES:${PN} += "qt6-httpserver-private-devel"

RDEPENDS:${PN} += "cmake-Qt6HttpServer \
qt6-core-private-devel \
qt6-network-private-devel \
qt6-websockets-private-devel"

inherit rpm
