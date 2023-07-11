SUMMARY = "Microsoft Azure Key Vault Secrets Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
* Secrets management (this library) - securely store and control \
  access to tokens, passwords, certificates, API keys, and other secrets \
* Cryptographic key management (azure-keyvault-keys) - create, store, \
  and control access to the keys used to encrypt your data \
* Certificate management (azure-keyvault-certificates) - create, \
  manage, and deploy public and private SSL/TLS certificates"
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python39-azure-keyvault-secrets-4.7.0-1.4.noarch.rpm"
RPM_HASH = "139965f8f3d7cbe13e61d6452ae91f3e7af026549ff5a11d8eb19cd70ff72f8673aa529f3149807dd0f55d036f2c7556f74f1d13d1aa01033b1c2fcbe8948286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-keyvault-secrets \
python39-azure-keyvault-secrets \
python3dist-azure-keyvault-secrets"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-keyvault-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
