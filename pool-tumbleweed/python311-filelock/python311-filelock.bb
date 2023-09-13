SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.3"

RPM_NAME = "python311-filelock-3.12.3-1.1.noarch.rpm"
RPM_HASH = "459b1a25779db673e6eb63faf18f018a87f76c03a360a029a44199911f6e3abdeac6b538ab91018787b608b3917fa039ecdcd225fea59ee74726604e0b1f88d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filelock \
python3.11dist-filelock \
python311-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
