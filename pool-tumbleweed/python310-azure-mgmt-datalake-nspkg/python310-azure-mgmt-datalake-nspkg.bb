SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-mgmt-datalake-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "f1b62770db99b7b3d7b90c72d9f122e3988bda4892808486f3ce2fcb97f3e2037c96d6c3a819762166c7833e24bf92b7416996942f2a123d06eb3b2bea550780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-nspkg \
python3.10dist-azure-mgmt-datalake-nspkg \
python310-azure-mgmt-datalake-nspkg \
python3dist-azure-mgmt-datalake-nspkg"

RDEPENDS:${PN} += "python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
