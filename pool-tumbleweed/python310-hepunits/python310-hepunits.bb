SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python310-hepunits-2.0.1-1.11.noarch.rpm"
RPM_HASH = "a775dd9d00781ce5089da6b4c2f37abfab8cb75154e7ee9273bb359fea959bd28586d79140940ddae2cc064e2c7cdd9e2c0a6ebb4863b447da0bfc6b386ce0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hepunits \
python3.10dist-hepunits \
python310-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
