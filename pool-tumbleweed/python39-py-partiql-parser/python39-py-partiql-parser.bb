SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python39-py-partiql-parser-0.3.5-1.1.noarch.rpm"
RPM_HASH = "bf4a9c36f74727edf54d8c0e0e7aae56bb6e255b1b83ad2d1db6a19e4d1b9cc0375477e25dffbbd182fc3afa76ed3750396f421a2701bbe8a55d3abbc7a55d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-partiql-parser \
python39-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
