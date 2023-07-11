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

RPM_NAME = "python310-azure-keyvault-nspkg-1.0.0-3.11.noarch.rpm"
RPM_HASH = "9043e4a50de05dc889302bcabcb71fc12c8581947cf91d5c6827e6114db85b1edeee70ab5dbd9a6e718e9e0efb87568ab5882944ab5d8ba0903d0efcce93bc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-keyvault-nspkg \
python310-azure-keyvault-nspkg \
python3dist-azure-keyvault-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
