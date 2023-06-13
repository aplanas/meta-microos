SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-azure-communication-sms-1.0.1-1.8.noarch.rpm"
RPM_HASH = "4f5b84502c19a6443a8b62dcf6abd4298d252a1d33e3d4e27c02ad5ab634a1b4a4d4b3da361ceff843de3c90badc00c15f9b3797daa34ec857803beaa23dcf6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-sms \
python3.10dist(azure-communication-sms) \
python310-azure-communication-sms \
python3dist(azure-communication-sms)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
