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

RPM_NAME = "python310-azure-keyvault-keys-4.8.0-1.4.noarch.rpm"
RPM_HASH = "dbdee86b33a7ad4a8b6330e506955ce2f6d5112aa0a56fa69cf8e7c492de3b0851e7d95db662df06287033151f7a4c7b9f61ed1a017cbac603c4c6efdc8a64e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-keyvault-keys \
python310-azure-keyvault-keys \
python3dist-azure-keyvault-keys"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
