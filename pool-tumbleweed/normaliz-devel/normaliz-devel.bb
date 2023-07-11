SUMMARY = "Development files for Normaliz, a tool for computation of rotational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. \
 \
Normaliz offers an API, libnormaliz, that allows the user to access \
the Normaliz computations from C++ programs."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "normaliz-devel-3.9.4-1.5.aarch64.rpm"
RPM_HASH = "132345cefd1161a52b46fc6e9c39df22e43a5412841e769279fd3ecfc115721df44bf7703260dfd4c50078b5428a886b04b90f82da98d1730441871247c86403"

RPROVIDES:${PN} += "normaliz-devel"

RDEPENDS:${PN} += "gmp-devel \
libnormaliz3"

inherit rpm
