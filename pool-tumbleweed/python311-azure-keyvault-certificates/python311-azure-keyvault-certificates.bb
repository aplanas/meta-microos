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

RPM_NAME = "python311-azure-keyvault-certificates-4.7.0-1.2.noarch.rpm"
RPM_HASH = "1f9c8e17ca4ce2432e85cbdda35c5b402a189c4887df3e6e5f5d487829fb303d5ba8f75d8a4bf50bebb2bcb93d4ed40fd7cbb1aca288c02196392679017329af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-keyvault-certificates \
python311-azure-keyvault-certificates \
python3dist-azure-keyvault-certificates"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
