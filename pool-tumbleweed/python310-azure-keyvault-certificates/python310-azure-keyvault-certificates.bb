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

RPM_NAME = "python310-azure-keyvault-certificates-4.7.0-1.2.noarch.rpm"
RPM_HASH = "8c7c8270372061ad3db2f0ba1cc2a1dab9976b4abd5ec5f00ae418869f86c8a61863cdf8d5c2319939dc4e0d0e95a8321a230162469eca2fabc79a42ca7308bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-certificates \
python3.10dist(azure-keyvault-certificates) \
python310-azure-keyvault-certificates \
python3dist(azure-keyvault-certificates)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
