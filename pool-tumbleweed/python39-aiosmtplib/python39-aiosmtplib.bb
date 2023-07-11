SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-aiosmtplib-2.0.2-1.1.noarch.rpm"
RPM_HASH = "cde1dc356d7ed40f6b9e11e9ffc3acb575f9e7621d4d9ed1ce355e6fda60939425238afb6a9d76161de4aa43721c9e1158e94d82406d3872c98207b2a34250b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiosmtplib \
python39-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
