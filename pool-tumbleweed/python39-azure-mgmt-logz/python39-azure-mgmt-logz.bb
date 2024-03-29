SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-logz-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "8706030f3018d914ca702518fe5648200b3803b13fa7130530b43349d7c73e803ae94cb529c2aecbaf0283289f2eacf127f6c4b578656514209f976791b2bcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-logz \
python39-azure-mgmt-logz \
python3dist-azure-mgmt-logz"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
