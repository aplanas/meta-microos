SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-crashtest-0.4.1-2.3.noarch.rpm"
RPM_HASH = "e6766dc489e90c4a7b878e6b61346da8cc6e0e6db3330108478c5b180a9ffef53a787554e311f28d7c26a58350e6bb13ae1291b243f0b9728e74c02c3a457490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crashtest \
python3.11dist-crashtest \
python311-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
