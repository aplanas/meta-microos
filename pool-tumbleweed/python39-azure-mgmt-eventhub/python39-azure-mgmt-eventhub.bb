SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python39-azure-mgmt-eventhub-11.0.0-1.1.noarch.rpm"
RPM_HASH = "48770a65d7aeeb1e6019418b761663b5a91740259144a4cf70bb6d981b4468171293a73687833b95ab06e22537bd089458283b6eb29623b16202104d76d62de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-eventhub) \
python39-azure-mgmt-eventhub \
python3dist(azure-mgmt-eventhub)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
