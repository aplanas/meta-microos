SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python311-pyux-0.0.6-1.15.noarch.rpm"
RPM_HASH = "56278a021fe12098ddc7be6ebdbd53dd6f80736a1b4a37cff12d3c09b0f85f2105a091ae87ba19b09130b0b7b6a94e800469a525e656899b73e6f2626ef006fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyux \
python3.11dist-pyux \
python311-pyux \
python3dist-pyux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
