SUMMARY = "pytest integration for aiomisc"
DESCRIPTION = "This package contains a plugin for pytest."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-aiomisc-pytest-1.1.1-1.3.noarch.rpm"
RPM_HASH = "3e1382388d77d6fc3c8d6ba840ec5e33fe3d3daec2be30f51a29979233341c580bc5c904aa09ce697c963ec49168bf7837181b7c2244ab54e68fb7274c906a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiomisc-pytest \
python39-aiomisc-pytest \
python3dist-aiomisc-pytest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
