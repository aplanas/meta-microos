SUMMARY = "Azure Communication Email client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Email. \
Key concepts \
 \
The Azure Communication Email package is used to do following: \
 \
 * Send emails to multiple types of recipients \
 * Query the status of a sent email message"
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-communication-email-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "7c486e24c149fbf170c598abc0d7ea0217b187b780b181a7a98ed347cb4ab863b91cef2ca09a3ad2c2a33b17a9803bb32bb9002f7ae0b9fc405a774ac49b17bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-email \
python3.10dist(azure-communication-email) \
python310-azure-communication-email \
python3dist(azure-communication-email)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
