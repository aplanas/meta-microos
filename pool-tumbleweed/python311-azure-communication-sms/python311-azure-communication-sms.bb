SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-communication-sms-1.0.1-1.10.noarch.rpm"
RPM_HASH = "deb87742ec72e4f83d62e5cf759769bfd0ea95130b0c4a58954a0202a603daf622f8784f2cdba7b209bb630305ea9fb37d6199ad5578b16a82e916befe570c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-sms \
python3.11dist-azure-communication-sms \
python311-azure-communication-sms \
python3dist-azure-communication-sms"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
