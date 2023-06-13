SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python311-hatchling-1.17.0-1.1.noarch.rpm"
RPM_HASH = "73ae6f7eb2b66d347dad61ada1a21a66795216a6c4ad2e2568828c2cb22e432142b1f5a0ff2535b009d66c7a250539116e81a48750bcff58dbc3bda2efa7b3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatchling) \
python311-hatchling \
python3dist(hatchling)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-editables \
python311-packaging \
python311-pathspec \
python311-pluggy \
python311-trove-classifiers \
update-alternatives"

inherit rpm
