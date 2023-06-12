SUMMARY = "Development headers for kweathercore"
DESCRIPTION = "Required headers to build components based on kweathercore."
LICENSE = "LGPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "kweathercore-devel-0.7-1.1.aarch64.rpm"
RPM_HASH = "96e45154fee6dbefdcf95ab1a27d2039228174a5d340a7e5e77025a3543cab1c0dc683bfc5c502cba3c12733ba4f17c6cf525ae87f7145ed1d02f823c12589a6"

RPROVIDES:${PN} += "cmake(KF5KWeatherCore) \
kweathercore-devel \
kweathercore-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5KWeatherCore5"

inherit rpm
