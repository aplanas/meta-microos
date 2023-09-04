SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python310-parameterized-0.9.0-2.1.noarch.rpm"
RPM_HASH = "06d59eb3db8c5c8464d3d289e5abaf9b5963654a89a08314bd7f804fc0934616c7d7ec1ff61c831650b023ec95d01783fa30ad3b037e9bb44147b4b4a5540819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parameterized \
python310-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
