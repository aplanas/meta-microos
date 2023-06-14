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

RPM_NAME = "python311-azure-keyvault-administration-4.3.0-1.2.noarch.rpm"
RPM_HASH = "aba34ee57192ac0d5bee281ee5dce8a432dfb00de48b257d05d0b5f0d4762a25360ec62cc8454b50c716f2ccd0da8fdd7a516215acfea683efc9175bd2ddf101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-keyvault-administration \
python311-azure-keyvault-administration \
python3dist-azure-keyvault-administration"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
