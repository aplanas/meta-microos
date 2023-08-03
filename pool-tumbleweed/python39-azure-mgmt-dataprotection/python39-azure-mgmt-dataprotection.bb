SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-mgmt-dataprotection-1.2.0-1.1.noarch.rpm"
RPM_HASH = "75e3a2b311633ba00cfca8d014dec9ac7da9f7d24d9f5d5d6c405ec6810436c527657d63bc694fd80ec9d339d5cd18eda9a99a68ffe7877afcefef231b63b406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dataprotection \
python39-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
