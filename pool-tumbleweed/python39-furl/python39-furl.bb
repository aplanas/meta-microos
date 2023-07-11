SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.3"

RPM_NAME = "python39-furl-2.1.3-3.1.noarch.rpm"
RPM_HASH = "e56f0bc453ae631aad3c6e34ff9842d7a85da7177ef9307935dd00c19c1e25fea43af47e5db3e556a77ee1bc648100930f5ff2a84990b74fc704cad9b7321c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-furl \
python39-furl \
python3dist-furl"

RDEPENDS:${PN} += "python-abi \
python39-orderedmultidict \
python39-six"

inherit rpm
