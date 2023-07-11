SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-azure-communication-sms-1.0.1-1.10.noarch.rpm"
RPM_HASH = "b18836e414e75b0d773610d5d26eef2060c55e2099ca206e1ecb70f7f7a9dcd014b5b5d3063587cb9af023129ec979b2010411575a3feed58c3bf10a51d508ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-sms \
python39-azure-communication-sms \
python3dist-azure-communication-sms"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
