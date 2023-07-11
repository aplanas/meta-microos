SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-mgmt-datalake-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "5a2a9b9f964ac25fd54c232386152cc46ea20c5d54152843323a3ff872057f12d373fdd60553fcfea78c8a1f4451e746c77bbc899ca92104ca16fde476514d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-nspkg \
python3.11dist-azure-mgmt-datalake-nspkg \
python311-azure-mgmt-datalake-nspkg \
python3dist-azure-mgmt-datalake-nspkg"

RDEPENDS:${PN} += "python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
