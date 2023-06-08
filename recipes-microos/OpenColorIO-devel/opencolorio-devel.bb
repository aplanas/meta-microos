SUMMARY = "Development Files for OpenColorIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-devel-2.1.2-2.4.aarch64.rpm"
RPM_HASH = "cd66923f12b409c9e5f5247faaf79b7fb56c713710fdc888780c1683ddf140be38005d6b6b4fc1721615b719600f93f4c7bd97d151c997f185b5c13897189091"

RPROVIDES:${PN} += "OpenColorIO-devel OpenColorIO-devel(aarch-64) cmake(OpenColorIO) pkgconfig(OpenColorIO)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libOpenColorIO2_1"

inherit rpm
