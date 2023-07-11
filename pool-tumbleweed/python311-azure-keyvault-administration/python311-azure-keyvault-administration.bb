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

RPM_NAME = "python311-azure-keyvault-administration-4.3.0-1.4.noarch.rpm"
RPM_HASH = "a006ac7e331a0875e6b723498f9eddf94e4a072bcbbde564f9a31528820f212960d886e68e04ba9ce96bbd55623ab62537a48748c7222abd550b764f1e20f05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-administration \
python3.11dist-azure-keyvault-administration \
python311-azure-keyvault-administration \
python3dist-azure-keyvault-administration"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-keyvault-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
