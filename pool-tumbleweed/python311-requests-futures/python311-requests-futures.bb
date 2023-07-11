SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-requests-futures-1.0.0-3.2.noarch.rpm"
RPM_HASH = "e6c0016a2bca6a728e9fba06750ddac3ff40bfa4564bc3c4c037ccb4c4766f10730fb588611943f64bde963e2f519c4f236fd8381929a0b491ac329ed4a64c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-futures \
python3.11dist-requests-futures \
python311-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
