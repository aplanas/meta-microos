SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-loadtestservice-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "3916f3704c8e78a99d6422a11e20a81af7f7cce06a992380f888426ab74d920842568a8b3cb22c1b6c9c084b78e3565f1c344f91e6cca242fb290214796d0240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-loadtestservice \
python39-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
