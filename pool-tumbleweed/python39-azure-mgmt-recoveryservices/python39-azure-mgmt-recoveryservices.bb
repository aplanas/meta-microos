SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-azure-mgmt-recoveryservices-2.4.0-1.1.noarch.rpm"
RPM_HASH = "2bbbf7d12625ce16e9d4dfd4e839788fdd6d1b588b5d2fd5b49a9f3553e7fd1bb9e58113b320dbdbb972569dac3f27a9aff81e9973f8afc018e47a68768ace7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-recoveryservices) \
python39-azure-mgmt-recoveryservices \
python3dist(azure-mgmt-recoveryservices)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
