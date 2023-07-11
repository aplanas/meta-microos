SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-azure-communication-sms-1.0.1-1.10.noarch.rpm"
RPM_HASH = "da79ed784979d70e40866fcd9da467f7a540cf8ca4cffb58cd016ef2feba8fd5ac24c3fbc1995d10631bdee81999c59ad134881b1c4115a99b7d735c146db135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-sms \
python310-azure-communication-sms \
python3dist-azure-communication-sms"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
