SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-mgmt-datalake-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "879e3a2a0cd534fe6980894c059323e81e275c18e3b040c926d10221aff0506938f8aeee6aa047c82317c1113fc24073427cbfb051c082ff5c88a4bab0df4682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-datalake-nspkg) \
python311-azure-mgmt-datalake-nspkg \
python3dist(azure-mgmt-datalake-nspkg)"

RDEPENDS:${PN} += "python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
