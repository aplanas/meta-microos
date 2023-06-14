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

RPM_NAME = "python39-azure-communication-email-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "d533f6eea750a45f9a6a58be92650ccdad1249061eaad5268926dd860e9f088d4f891f4c9aab57669d77a8a2ec9e18595cf3a95e2a4a9f0ce3969ad9997339eb"
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
