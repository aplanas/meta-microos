SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python39-azure-batch-14.0.0-1.2.noarch.rpm"
RPM_HASH = "1fbcec062d7e64a70112474d12e92073539765138ed19f54355692bdfb694d783e6539d293a031158b47cc1f393b17f93b5a4d5bbdf21bd3952ba9f24279bc04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-batch \
python39-azure-batch \
python3dist-azure-batch"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
