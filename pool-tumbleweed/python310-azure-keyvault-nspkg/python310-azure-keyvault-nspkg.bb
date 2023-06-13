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

RPM_NAME = "python310-azure-keyvault-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "fd287b8c47f412ea7117ebf5f8a7fc22038d27a69f7d5ceac7913f2fa0099ec4e5df6b8f7ac1a01dd5d5a7c578e1c51baa7dbbeb2943331d351149c52baf8b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-nspkg \
python3.10dist(azure-keyvault-nspkg) \
python310-azure-keyvault-nspkg \
python3dist(azure-keyvault-nspkg)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm
