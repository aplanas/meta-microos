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

RPM_NAME = "python311-azure-keyvault-certificates-4.7.0-1.4.noarch.rpm"
RPM_HASH = "e2256832a10aa7620c1503d349581e7d9790be3d2950c0289ace4b40193ddd7b8751fefac8ad92669773ea41057d2204f739f8ef0f140a7622a3625e9f4fdbaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-certificates \
python3.11dist-azure-keyvault-certificates \
python311-azure-keyvault-certificates \
python3dist-azure-keyvault-certificates"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
