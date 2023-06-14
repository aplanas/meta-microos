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

RPM_NAME = "python310-azure-keyvault-keys-4.8.0-1.2.noarch.rpm"
RPM_HASH = "ff1e4b3ca0895f7f72c4d678d5d4192cf88974e5873361699e18bf1090ebd2b4e9991b008d8fbb8194fffa77d2ce09d974a1c9c8e39dcf24b290d0013329b73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-keys \
python3.10dist-azure-keyvault-keys \
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
