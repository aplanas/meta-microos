SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-mergedeep-1.3.4-3.1.noarch.rpm"
RPM_HASH = "289b77dbfe1b55cbf5b78a21fb6c473f19edcd85cb9d114d32b94da70ebf0b2b16384b81be8a4f9331517fd804deb510e9e9f50ad6ff45fed8fd85721bf2e2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mergedeep \
python310-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
