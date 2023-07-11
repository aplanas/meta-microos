SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "0.18.3"

RPM_NAME = "python310-gwcs-0.18.3-1.5.noarch.rpm"
RPM_HASH = "45bf0bb88085a7f14582583f6af119954128cc5aa96453d6039c8d56a77cb9625785153c219dc356e327b5a5f23a19939a05ef558976bff03a63d0cc74d6ffa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gwcs \
python310-gwcs \
python3dist-gwcs"

RDEPENDS:${PN} += "python-abi \
python310-asdf \
python310-asdf-astropy \
python310-asdf-wcs-schemas \
python310-astropy \
python310-numpy \
python310-scipy"

inherit rpm
