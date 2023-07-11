SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-crashtest-0.4.1-2.3.noarch.rpm"
RPM_HASH = "672e4e98f54ebfcd586a9c1490ad80ae661b21c53428aab8b9890c45311e88f65ea5c264af0e2a9891512927f3d90b949c4310b586797b83a88d87311e9da099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crashtest \
python310-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
