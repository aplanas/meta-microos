SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-pytest-toolbox-0.4-3.5.noarch.rpm"
RPM_HASH = "372c2e296d9a0457d4494796534a4b88d92b2489852b05a2d3fa6a4d0c092272adc70f74457f52204f6666b0694d6899971aacbccd6649976c5abc62d73db8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-toolbox \
python3.11dist-pytest-toolbox \
python311-pytest-toolbox \
python3dist-pytest-toolbox"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
