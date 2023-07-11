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

RPM_NAME = "python311-azure-communication-email-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "384a3df916c298b89a7cd111ba1c2a2ef515f4d9f9240d6adf673d80b1ea4fe5605bf0989d454612d7bbbc80d5b7e422b61c393c63e97643b04e8686570f0bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-email \
python3.11dist-azure-communication-email \
python311-azure-communication-email \
python3dist-azure-communication-email"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
