SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python311-bytecode-0.14.2-1.1.noarch.rpm"
RPM_HASH = "b80de977bc4b2fbcb0c63ee0a8da1c8c07ba84552c555ea840d3f898b9084587ac949c2f3a572a4f6bf99dbc477d23ba3fdbb4a368f1c2b7e8df55f9a616defb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bytecode \
python311-bytecode \
python3dist-bytecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
