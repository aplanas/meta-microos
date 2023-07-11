SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "python39-requirements-parser-0.2.0-6.3.noarch.rpm"
RPM_HASH = "95dd642c018da59355c7a6933df30fa3d24d72c0b91f1b55043d8a48f34d86c33758666110568b487f8d01d550e6f3f7e7b3d3edf77ef9c827ce25ebb3fc9d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requirements-parser \
python39-requirements-parser \
python3dist-requirements-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
