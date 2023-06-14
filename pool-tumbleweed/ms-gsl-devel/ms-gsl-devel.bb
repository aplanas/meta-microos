SUMMARY = "Development files for ms-gsl"
DESCRIPTION = "Development files for ms-gsl."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ms-gsl-devel-4.0.0-1.1.noarch.rpm"
RPM_HASH = "d9c27915e921ae2f2a365582d331c0f4835b0e8231d577624589a7ed93799cbbb671f41c0a664be2cd8d1a451814d9ef2d0bf7bf22710212fee6c7227fe5d9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-Microsoft.GSL \
ms-gsl-devel"

RDEPENDS:${PN} += ""

inherit rpm
