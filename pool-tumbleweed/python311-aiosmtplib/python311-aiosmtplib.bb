SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-aiosmtplib-2.0.2-1.1.noarch.rpm"
RPM_HASH = "87586efd26b788d97c7069cfdb971085207ec8461cdae15f1a582d44e8492f901f91d559d03a9db0adf095eeae66b28edeafc85d2a0a879c25606b3a0a5a8980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosmtplib \
python3.11dist-aiosmtplib \
python311-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
