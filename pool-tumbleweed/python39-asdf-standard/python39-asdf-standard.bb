SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-asdf-standard-1.0.3-1.3.noarch.rpm"
RPM_HASH = "38c5c406131ac686b561f0c87e9085e602bf6790b610e81730474b67def637f44151feaa64d9cc5f0cf6a3b6e254498911f67e05021ed671f670b9f65d08fe67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf-standard) \
python39-asdf-standard \
python39-asdf_standard \
python3dist(asdf-standard)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
