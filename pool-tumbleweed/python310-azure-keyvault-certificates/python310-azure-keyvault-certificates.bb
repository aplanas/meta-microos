SUMMARY = "Microsoft Azure Key Vault Certificates Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
Certificate management (this library) - create, manage, and deploy public and \
private SSL/TLS certificates Cryptographic key management (azure-keyvault-keys) \
- create, store, and control access to the keys used to encrypt your data Secrets \
management (azure-keyvault-secrets) - securely store and control access to tokens, \
passwords, certificates, API keys, and other secrets."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python310-azure-keyvault-certificates-4.7.0-1.4.noarch.rpm"
RPM_HASH = "3eba9567b13e67cf57f85d6056b904a1094390afe02c27179a88b67cfd7be9dbb38202d9de87ee15f7cfb86aed30d5d53b25b01eca1b0692a37ccc97947364d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-keyvault-certificates \
python310-azure-keyvault-certificates \
python3dist-azure-keyvault-certificates"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
