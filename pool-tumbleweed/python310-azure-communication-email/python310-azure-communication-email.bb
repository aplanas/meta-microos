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

RPM_NAME = "python310-azure-communication-email-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "e7f9343dd96ea6fc6d08934f6316f1c487415f80ca0158bd25f1778a0c631d07862a6d468e835cab80686f93c016f5b0794f1def75e1d1e605fe9984cae26e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-email \
python310-azure-communication-email \
python3dist-azure-communication-email"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
