SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-crashtest-0.4.1-2.3.noarch.rpm"
RPM_HASH = "5420324e07cd9e9889ec9a0946d3c5c092133b5eb27725e6de5a73c30e58abbfac69a1ff6513e08c109bde689eae587203cce8c1c3c471e0972cfefd4c99b41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crashtest \
python39-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
