SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-asdf-standard-1.0.3-1.5.noarch.rpm"
RPM_HASH = "6c1285cacfeaba75789f57e26b7e7cc64ec4c2d9a6e444d11906723ec67f6ad503e57055b2717752f5b3436e7285fb4973b0c68e9a7c3b52174d19f714aceee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-standard \
python39-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
