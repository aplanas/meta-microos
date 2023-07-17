SUMMARY = "Non-ABI stable API for the Qt 6 HttpServer Library"
DESCRIPTION = "This package provides private headers of libQt6HttpServer that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bfee677828559d2de26f89062fa34d34e8dabf80d9fa75d0652d6cb5623512df0b4ab874bf6f01479eb5ba38c103a8181615db25caa8826b5e04a4248af84184"

RPROVIDES:${PN} += "qt6-httpserver-private-devel"

RDEPENDS:${PN} += "cmake-Qt6HttpServer \
qt6-core-private-devel \
qt6-network-private-devel \
qt6-websockets-private-devel"

inherit rpm
