SUMMARY = "Microsoft Azure Key Vault Administration Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
Certificate management (this library) - create, manage, and deploy public and \
private SSL/TLS administration Cryptographic key management (azure-keyvault-keys) \
- create, store, and control access to the keys used to encrypt your data Secrets \
management (azure-keyvault-secrets) - securely store and control access to tokens, \
passwords, administration, API keys, and other secrets."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python310-azure-keyvault-administration-4.3.0-1.2.noarch.rpm"
RPM_HASH = "c0f451dd5a22e301f15c7a66443dad97eb2aedf5e22d4b494f2a4e5eb0ae235e8cae21e1ebaac5b354ea252cf4e0be5b6b6c36d9f5fdfc94374f125b89fcdf06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-administration \
python3.10dist(azure-keyvault-administration) \
python310-azure-keyvault-administration \
python3dist(azure-keyvault-administration)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
