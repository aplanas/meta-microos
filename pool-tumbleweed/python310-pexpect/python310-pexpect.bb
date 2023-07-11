SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python310-pexpect-4.8.0-10.3.noarch.rpm"
RPM_HASH = "ee1473c1499e571e79e8d5af9b5f7d00563add1d8e3c2fb70be239f8d2004c2de4c13d9e59c60f1443a6be91bab3a16fb3b7fae26c99e78edb2c029b28b278c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pexpect \
python310-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python310-ptyprocess"

inherit rpm
