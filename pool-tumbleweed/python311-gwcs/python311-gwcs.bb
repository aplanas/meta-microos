SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "0.18.3"

RPM_NAME = "python311-gwcs-0.18.3-1.3.noarch.rpm"
RPM_HASH = "bebbd9b3ff6d56e9579ef0ae41d1fe08f754974f33cbfb3ea057ec9d03a0c22029eea01667d5e2e439603ee1852c5bc8c2215c0bd5e0486884baa432141e5638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gwcs \
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
