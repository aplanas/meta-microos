SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-mujson-1.4-2.16.noarch.rpm"
RPM_HASH = "3b34bcff5446f6fba8bab273948ed20836d502911b0d915d669728aa68f7171a8e18d428159715579a2b6cbe80f2483200dd3120527a3ebab2b1cb7608c656bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mujson \
python3.11dist-mujson \
python311-mujson \
python3dist-mujson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
