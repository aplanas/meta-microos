SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-aiosmtplib-2.0.2-1.1.noarch.rpm"
RPM_HASH = "6246394b8daf28af2dc557c1d7f09e83fc1eb2c6d219c7c361510e405eaab0a1953fb4c6d540f11de5ecd8e46813a6966aa91661ea14d10fdcfa40b473964a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiosmtplib \
python310-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
