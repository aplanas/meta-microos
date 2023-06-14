SUMMARY = "MS Azure Servicefabricmanagedclusters Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicefabricmanagedclusters Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-servicefabricmanagedclusters-1.0.0-2.2.noarch.rpm"
RPM_HASH = "326e3718df3b5a287206e6a9550a2631d0a436201461cd1df0a8ed5514c77fb49e8c2f24e2c10e76b1b9b48861e99814782fb8e79e896abae5a35557de88cefb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicefabricmanagedclusters \
python3.10dist-azure-mgmt-servicefabricmanagedclusters \
python310-azure-mgmt-servicefabricmanagedclusters \
python3dist-azure-mgmt-servicefabricmanagedclusters"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
