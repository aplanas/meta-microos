SUMMARY = "Microsoft Azure Key Vault Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Key Vault namespace package. It isn't intended to be \
installed directly. Key Vault client libraries are located elsewhere: \
 \
* azure-keyvault-certificates \
* azure-keyvault-keys \
* azure-keyvault-secrets \
 \
This package is for Python 2 only. It provides the necessary files for other packages \
to extend the azure namespace. Python 3.x libraries use PEP420 instead."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-keyvault-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "06e9b1de9e992ae44469154c3c30ccd5820bdce0b5fc3d418619022bfb466823fa1ffc8149e088f2ea51a77bbc78ba607e7ef26186eb6f7ed44290038a9ffb01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-keyvault-nspkg) \
python39-azure-keyvault-nspkg \
python3dist(azure-keyvault-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm
