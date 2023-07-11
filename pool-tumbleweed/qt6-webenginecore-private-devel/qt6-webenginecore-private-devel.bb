SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginecore-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "f0523383d53b3d995d16470df3a00b81c5f1aa3a6840b9d151e47195ff781b4ffede7b8c0e30c8386ee374b5c368a35d394a6f06789191fd68c207f697e3bd20"

RPROVIDES:${PN} += "qt6-webenginecore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineCore"

inherit rpm
