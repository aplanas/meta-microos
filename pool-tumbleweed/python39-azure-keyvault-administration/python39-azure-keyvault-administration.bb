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

RPM_NAME = "python39-azure-keyvault-administration-4.3.0-1.4.noarch.rpm"
RPM_HASH = "a39fceef492a43119bfa9fc4a9bcb818013942271f154f789e434b524db69b324bc841b8712f8b2d35aed7d033ea1a0e7fbe4a83af8ac4cbb5f38e6eb6e8297a"
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
