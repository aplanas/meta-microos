SUMMARY = "Microsoft Azure Key Vault Keys Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
 * Cryptographic key management (this library) - create, store, \
   and control access to the keys used to encrypt your data \
 * Secrets management (azure-keyvault-secrets) - securely store \
   and control access to tokens, passwords, certificates, API \
   keys, and other secrets \
 * Certificate management (azure-keyvault-certificates) - create, \
   manage, and deploy public and private SSL/TLS certificates"
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python39-azure-keyvault-keys-4.8.0-1.2.noarch.rpm"
RPM_HASH = "41a34e14cea42f5a3e976d8dd6b08a5f3909690cbb0f2ba53873e3b6c22a59c13310196b0cf0f25a667f33e01b8d6240d55645d6e2cf967b8c98dd72e9f8d566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-keyvault-keys \
python39-azure-keyvault-keys \
python3dist-azure-keyvault-keys"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-keyvault-nspkg \
python39-azure-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
