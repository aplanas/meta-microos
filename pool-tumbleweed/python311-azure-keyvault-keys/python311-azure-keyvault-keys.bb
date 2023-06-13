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

RPM_NAME = "python311-azure-keyvault-keys-4.8.0-1.2.noarch.rpm"
RPM_HASH = "7e9515f9c61f2b93a30d7120e945127753eff58c40fc0ec993a554605fda76116f63e3164493c978a12e50ac37f6ff9dd91859015a65b25faf408107adc3ca27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-keyvault-keys) \
python311-azure-keyvault-keys \
python3dist(azure-keyvault-keys)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
