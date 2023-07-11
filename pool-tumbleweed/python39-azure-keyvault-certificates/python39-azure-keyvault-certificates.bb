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

RPM_NAME = "python39-azure-keyvault-certificates-4.7.0-1.4.noarch.rpm"
RPM_HASH = "72cab0185fa1a8520ca3d5b5f1e65d06ed0a7875ceeee1026bfe0755a110f7c1a85d3d48dd7ac4a215aa8600d42e4e196f0c1cb3e083bce59a3b1496af8df22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-keyvault-certificates \
python39-azure-keyvault-certificates \
python3dist-azure-keyvault-certificates"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-keyvault-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
