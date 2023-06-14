SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-datadog-2.0.0-1.8.noarch.rpm"
RPM_HASH = "b171a6f6c4d6dafda9872cc321bfaddce2cd23fbf18370a6c8122f093f3efa2f7602e7e5f608ec7145b0f131408ca40e3a1af130734849ec02b04cc138351d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-datadog \
python39-azure-mgmt-datadog \
python3dist-azure-mgmt-datadog"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
