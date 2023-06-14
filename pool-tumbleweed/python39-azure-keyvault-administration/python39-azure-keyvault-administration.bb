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

RPM_NAME = "python39-azure-keyvault-administration-4.3.0-1.2.noarch.rpm"
RPM_HASH = "23cf3d6f9c0e1c807198ded018a6a830660d3f45574eccf56f9ae0fbff89d2504169aec7d03299bb9adf1ef4a0cb3113a3b2025047134e5a63e7f411f6b3bb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-keyvault-administration \
python39-azure-keyvault-administration \
python3dist-azure-keyvault-administration"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-keyvault-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
