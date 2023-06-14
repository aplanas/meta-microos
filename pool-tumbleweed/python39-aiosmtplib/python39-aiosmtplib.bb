SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-aiosmtplib-2.0.1-1.3.noarch.rpm"
RPM_HASH = "fdd5fe84f9f4631e1e7bc1a078aede930767ce2523d7cf44e30373aee6a7cd3a5ac964174de2d25e0e4933ccbe929dafa2f5241260ee03da820c216e999088f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiosmtplib \
python39-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
