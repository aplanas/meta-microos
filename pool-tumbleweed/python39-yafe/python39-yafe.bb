SUMMARY = "Yet Another Framework for Experiments"
DESCRIPTION = "The package yafe offers a generic framework to conduct \
scientific experiments."
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python39-yafe-1.0.3-2.10.noarch.rpm"
RPM_HASH = "7d9f3c0f5016d0a981b702d11b88f4e6c306e3d5db596bb1c9525649006364a9ea6aeea9eec1c929931ac0fec57577bcf4c82159cd05363beb6f2b684939d5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yafe \
python39-yafe \
python3dist-yafe"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
