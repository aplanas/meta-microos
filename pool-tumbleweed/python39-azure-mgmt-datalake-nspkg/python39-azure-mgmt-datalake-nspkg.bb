SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-mgmt-datalake-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "d285316868fa3de3af4e695aa9fa5dfa54c40888c16a48466fd95c81c02a1a0b39799fc1a7584b61928d445afde87a3851e62317883bdc1017ddae8f4f6ae149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-datalake-nspkg \
python39-azure-mgmt-datalake-nspkg \
python3dist-azure-mgmt-datalake-nspkg"

RDEPENDS:${PN} += "python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
