SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-asdf-astropy-0.4.0-1.3.noarch.rpm"
RPM_HASH = "7d01f47faf33506ec1aa6cc095ff970eb98483ff6b65333109c1d11e3dbed3b2a9f1f026692a3bf073ed87ea5213add69976d9d65e99c6201146ac7926463e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-astropy \
python39-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python39-asdf \
python39-asdf-coordinates-schemas \
python39-asdf-transform-schemas \
python39-astropy \
python39-numpy \
python39-packaging"

inherit rpm
