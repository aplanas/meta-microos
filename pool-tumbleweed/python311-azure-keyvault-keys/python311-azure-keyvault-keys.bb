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

RPM_NAME = "python311-azure-keyvault-keys-4.8.0-1.4.noarch.rpm"
RPM_HASH = "53f2c4559d02766078c622328e792e8c7e0df3e04f30a2a4f4f71ad65c982348a6085aacb9d56cdea8c35023bfb8ba39217ae43efcb64a76276635137a152d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-keys \
python3.11dist-azure-keyvault-keys \
python311-azure-keyvault-keys \
python3dist-azure-keyvault-keys"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
