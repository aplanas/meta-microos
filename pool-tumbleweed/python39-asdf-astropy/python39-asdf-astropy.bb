SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-asdf-astropy-0.4.0-1.4.noarch.rpm"
RPM_HASH = "94c46e847910454cbb40d9c1f299d9ba40914de8b8973098d7209c196315449cfeb1bf03cfec3d1579f70b71f2e90152aa8e320acc461410183b0e21e733c20b"
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
