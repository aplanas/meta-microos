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

RPM_NAME = "python310-azure-keyvault-administration-4.3.0-1.4.noarch.rpm"
RPM_HASH = "037104e4418397fad5fbd3970b5e1f4bad791a893449d07d8e213fbf3542350fb8fd857280623c4f6993b58d898303f10ee10403beb496113cce60737e53fc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-keyvault-administration \
python310-azure-keyvault-administration \
python3dist-azure-keyvault-administration"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
