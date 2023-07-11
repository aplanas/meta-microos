SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python39-affine-2.3.1-1.5.noarch.rpm"
RPM_HASH = "3e294f95b93ed6f97e743658417bb630c1afbcf52306ff08472d2549874ad5025aa5419f08b4f0e3213ece5f61897c3a77a7225cf654c45a64cdf209ad25a7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-affine \
python39-affine \
python3dist-affine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
