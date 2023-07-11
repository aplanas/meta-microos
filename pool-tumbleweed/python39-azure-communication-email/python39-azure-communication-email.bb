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

RPM_NAME = "python39-azure-communication-email-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "b44059e167096311d95e7e1cac8cff482774c6692ecd83e34f1ef448e5432853888c7193b8f94f0dce843603445ea5b5c078d7a49134af6ed8bd7b10fd0fdea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-email \
python39-azure-communication-email \
python3dist-azure-communication-email"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
