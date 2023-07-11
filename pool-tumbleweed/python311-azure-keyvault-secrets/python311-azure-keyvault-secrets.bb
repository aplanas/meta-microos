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

RPM_NAME = "python311-azure-keyvault-secrets-4.7.0-1.4.noarch.rpm"
RPM_HASH = "e64480eaaade33dcbbbe3e9c68d421b4e2a48b1a9f72e71810107cc196c84afc69ea5c3ebc36f3d677808b3fae94375e35f1fa4a2d956aeb81a0096ac46061d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-secrets \
python3.11dist-azure-keyvault-secrets \
python311-azure-keyvault-secrets \
python3dist-azure-keyvault-secrets"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
