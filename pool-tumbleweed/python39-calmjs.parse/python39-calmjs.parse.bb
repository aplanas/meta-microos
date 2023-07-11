SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-calmjs.parse-1.3.0-3.1.noarch.rpm"
RPM_HASH = "94adc150c86ac5587b97c85148fa9f5a1f1dbb72d689be95685e60ff1f700b70e3d6d36ebba2cf1d784611f06e281e0d2a9a89b57382f019934623cb4adad45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-calmjs.parse \
python39-calmjs.parse \
python3dist-calmjs.parse"

RDEPENDS:${PN} += "python-abi \
python39-ply \
python39-setuptools"

inherit rpm
