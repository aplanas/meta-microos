SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python311-azure-batch-14.0.0-1.2.noarch.rpm"
RPM_HASH = "6194a51dd359c1e36e45f7ba302eb4c14d3a9715c2218e80668be375f73c85d1b8f667c0c9cb0ba3a9823f7859973d100f9b0aa1960addeb319d3f7e22efe67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-batch \
python3.11dist-azure-batch \
python311-azure-batch \
python3dist-azure-batch"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
