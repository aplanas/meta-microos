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

RPM_NAME = "python311-azure-keyvault-nspkg-1.0.0-3.11.noarch.rpm"
RPM_HASH = "4ae60f8bc78906d689d634ee77f15589e44c188410d2c3b20ea0f1033e55c610ca2a558849b2b7842a2d208c90dbbfa9c7111932735e8fe6d6d3ca9da3fa7c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-nspkg \
python3.11dist-azure-keyvault-nspkg \
python311-azure-keyvault-nspkg \
python3dist-azure-keyvault-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
