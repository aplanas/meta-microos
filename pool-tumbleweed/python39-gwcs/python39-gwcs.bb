SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "0.18.3"

RPM_NAME = "python39-gwcs-0.18.3-1.5.noarch.rpm"
RPM_HASH = "9f90b7b6c4e8480c8a1d4e8d10fb17334f684b0bc056c3aa0a96d098bd55841399bb7aabd22f75eab039ab63feebaf9a4d90ea009953c8fd7932777bd3821889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gwcs \
python39-gwcs \
python3dist-gwcs"

RDEPENDS:${PN} += "python-abi \
python39-asdf \
python39-asdf-astropy \
python39-asdf-wcs-schemas \
python39-astropy \
python39-numpy \
python39-scipy"

inherit rpm
