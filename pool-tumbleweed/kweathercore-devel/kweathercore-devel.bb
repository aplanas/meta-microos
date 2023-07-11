SUMMARY = "Development headers for kweathercore"
DESCRIPTION = "Required headers to build components based on kweathercore."
LICENSE = "LGPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "kweathercore-devel-0.7-1.2.aarch64.rpm"
RPM_HASH = "a5d9de2ac1faa1209f49e0811791ceb54cc112ae0e0d8d73e7bd98998c73b7b135725362d615957016e062059c3d83a06827dd9541258f88f34d7f892ebd9d11"

RPROVIDES:${PN} += "cmake-KF5KWeatherCore \
kweathercore-devel"

RDEPENDS:${PN} += "libKF5KWeatherCore5"

inherit rpm
