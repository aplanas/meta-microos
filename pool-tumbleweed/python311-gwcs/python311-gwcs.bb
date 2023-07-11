SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "0.18.3"

RPM_NAME = "python311-gwcs-0.18.3-1.5.noarch.rpm"
RPM_HASH = "13331a38d54c01de69231742ea14c4e1a7c9e5fd94dca92ce67376f1d91ac5973c4f3e98783b5115f7c502a2ff3cc21960a2db88eb2b2acafbc49b2c8e425169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwcs \
python3.11dist-gwcs \
python311-gwcs \
python3dist-gwcs"

RDEPENDS:${PN} += "python-abi \
python311-asdf \
python311-asdf-astropy \
python311-asdf-wcs-schemas \
python311-astropy \
python311-numpy \
python311-scipy"

inherit rpm
