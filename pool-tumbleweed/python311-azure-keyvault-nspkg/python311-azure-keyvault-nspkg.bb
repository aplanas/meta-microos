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

RPM_NAME = "python311-azure-keyvault-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "f08b5b5c526bbffd0efe2c38b324cd81e9a0860603d16c89cb8ce29dce1347d5d1c87f3bfd55a01b585dd979a11226e0c6091524daf0d56f4969e3d2f0d4bd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-keyvault-nspkg \
python311-azure-keyvault-nspkg \
python3dist-azure-keyvault-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
