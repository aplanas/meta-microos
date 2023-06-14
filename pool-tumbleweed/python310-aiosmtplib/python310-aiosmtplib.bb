SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-aiosmtplib-2.0.1-1.3.noarch.rpm"
RPM_HASH = "8f95854cf82448f2874932a43e77c17dfe6ab7f22b0961a4f5b31fba7f5f47ec93623832b9cd08e94845fa49deb8ce04b8aa50167c9d82a576b79a0f921779f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosmtplib \
python3.10dist-aiosmtplib \
python310-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
