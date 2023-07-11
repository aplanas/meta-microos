SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-mgmt-datalake-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "7836632024a60225ba9ab70d0799c2888d2a42d08d67755274a1e3773ec3835dae1aa7798bb4db13a36f75bf9cfb9dd62c93e87c8555c2b80c897c633df9b834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-datalake-nspkg \
python310-azure-mgmt-datalake-nspkg \
python3dist-azure-mgmt-datalake-nspkg"

RDEPENDS:${PN} += "python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
