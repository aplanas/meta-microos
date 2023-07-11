SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-selfhelp-1.0.0-1.1.noarch.rpm"
RPM_HASH = "438f241a4f6550f0bd650d7ae9a9cd4489d6dbad2f88e3fc19ea1116300725c858140ce057c51153756e67bc8069c4f3028445df7097e0acb875a02e9a531115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-selfhelp \
python310-azure-mgmt-selfhelp \
python3dist-azure-mgmt-selfhelp"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
