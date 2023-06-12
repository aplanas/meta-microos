SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-asdf-astropy-0.4.0-1.1.noarch.rpm"
RPM_HASH = "afd66fbbbfe62d4e53f1f32ac1745f63d8fff200accb678486566ad68820d4c5605344c4ed71e941b43b6394b9b4a6cee46ee91bf287fb21635ecaa0716937ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf-astropy) \
python39-asdf-astropy \
python3dist(asdf-astropy)"
RDEPENDS:${PN} += "python(abi) \
python39-asdf \
python39-asdf-coordinates-schemas \
python39-asdf-transform-schemas \
python39-astropy \
python39-numpy \
python39-packaging"

inherit rpm
