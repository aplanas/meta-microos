SUMMARY = "Parallel asyncio Python setup(cfg|py) test runner"
DESCRIPTION = "Parallel asyncio Python setup.(cfg|py) test runner."
LICENSE = "MIT"

PV = "20.2.26"

RPM_NAME = "python310-ptr-20.2.26-3.12.noarch.rpm"
RPM_HASH = "c526f6ad9e88d36f0e0caf0296fcfbad3a2e0772209984f8ccd45011838dcc62e96a1e200e7930c88a7cb98ec0f8348e3bd69e6f19caa0d6725bfeb1a7332dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptr \
python3.10dist-ptr \
python310-ptr \
python3dist-ptr"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
