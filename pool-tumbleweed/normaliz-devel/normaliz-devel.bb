SUMMARY = "Development files for Normaliz, a tool for computation of rotational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. \
 \
Normaliz offers an API, libnormaliz, that allows the user to access \
the Normaliz computations from C++ programs."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "normaliz-devel-3.9.4-1.4.aarch64.rpm"
RPM_HASH = "e4cd56479f5832e691b3b37696607c2fe1559cb51a4d5d7626fc8804f783028859e4c7d2c078be22b3d1c3ccb92d60d6481de68e647a6c8554c1234815feae67"

RPROVIDES:${PN} += "normaliz-devel \
normaliz-devel(aarch-64)"

RDEPENDS:${PN} += "gmp-devel \
libnormaliz3"

inherit rpm
