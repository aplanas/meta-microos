SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python39-beniget-0.4.1-2.2.noarch.rpm"
RPM_HASH = "e5c9478d26c48f36b6e8656306a6c01d10eb6bf83292c5b8fb0bdc841fec3b3d52d55e46d21424a586e4343180e53069deadbede2e636610d214a5446b58d17e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-beniget \
python39-beniget \
python3dist-beniget"

RDEPENDS:${PN} += "python-abi \
python39-gast"

inherit rpm
