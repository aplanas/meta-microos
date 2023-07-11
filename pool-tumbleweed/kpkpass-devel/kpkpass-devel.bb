SUMMARY = "Development files for kpkpass"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kpkpass library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kpkpass-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "667b81326ce093b332f05f9e1325ad7d966bdee968d33ce946bbf70b335b4da0d3070fca088de8c9e2e377205ed3fa61845b9fe7ae8cd457f9f0f4a0a1310422"

RPROVIDES:${PN} += "cmake-KPim5PkPass \
cmake-KPimPkPass \
kpkpass-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
libKPim5PkPass5"

inherit rpm
