SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-booleanOperations-0.9.0-2.7.noarch.rpm"
RPM_HASH = "f3eccfa81af38bff86ff75bc6aa2a3b073e5f3bfbb39609e1a5d221882facb9efb617b5a86eac293aa55d9e7bbcd8cde4318caa2c6c43b023825b1b55cb033a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-booleanoperations \
python39-booleanOperations \
python3dist-booleanoperations"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-pyclipper"

inherit rpm
