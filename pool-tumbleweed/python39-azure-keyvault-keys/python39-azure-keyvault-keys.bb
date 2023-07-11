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

RPM_NAME = "python39-azure-keyvault-keys-4.8.0-1.4.noarch.rpm"
RPM_HASH = "c26f9cea6e65417a387af35cfd355d00e41965c01540ce293d526a4d1e088553749bf9d4e1e1414276386ded6d9867ddc13931d0ef11ca6150be207cb5606f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-keyvault-keys \
python39-azure-keyvault-keys \
python3dist-azure-keyvault-keys"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-keyvault-nspkg \
python39-azure-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
