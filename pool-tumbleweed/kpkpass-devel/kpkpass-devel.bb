SUMMARY = "Development files for kpkpass"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kpkpass library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kpkpass-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "98e864a06a4bc6eea9c97ca0e9b37e0848fd86ea8861c9e102d4c61af2507e135e9c232a236ed6dfdbb3ecc12b776d4fe3ab3e3ea38f88ff69a227e5cdf6e0f4"

RPROVIDES:${PN} += "cmake-KPim5PkPass \
cmake-KPimPkPass \
kpkpass-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
libKPim5PkPass5"

inherit rpm
