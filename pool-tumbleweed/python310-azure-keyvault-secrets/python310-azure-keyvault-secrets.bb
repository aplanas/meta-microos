SUMMARY = "Microsoft Azure Key Vault Secrets Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
* Secrets management (this library) - securely store and control \
  access to tokens, passwords, certificates, API keys, and other secrets \
* Cryptographic key management (azure-keyvault-keys) - create, store, \
  and control access to the keys used to encrypt your data \
* Certificate management (azure-keyvault-certificates) - create, \
  manage, and deploy public and private SSL/TLS certificates"
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python310-azure-keyvault-secrets-4.7.0-1.4.noarch.rpm"
RPM_HASH = "c008f830be2c1ed93322f06fd4640e6a0c9b2f1eb6f91760f1cd8bb306cc49e2c97f08796400bb73b61ce122a5b1f088152f011ce3101ec04804959a76ae055b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-keyvault-secrets \
python310-azure-keyvault-secrets \
python3dist-azure-keyvault-secrets"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
