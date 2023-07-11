SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python39-methodtools-0.4.2-1.14.noarch.rpm"
RPM_HASH = "6cdd7d0ab826808179403d3d993f7e0a14c96920b2acfd8632afea76f645519420f173e157c6bfa6b349fcd9a00fc4810149294312835ce9ae8c492d5677abb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-methodtools \
python39-methodtools \
python3dist-methodtools"

RDEPENDS:${PN} += "python-abi \
python39-wirerope"

inherit rpm
