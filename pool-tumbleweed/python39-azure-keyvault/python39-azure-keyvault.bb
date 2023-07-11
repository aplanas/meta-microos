SUMMARY = "Microsoft Azure Key Vault Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault libraries bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide APIs for Key Vault operations: \
 \
- azure-keyvault-keys \
- azure-keyvault-secrets \
- azure-keyvault-certificates"
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-azure-keyvault-4.2.0-1.8.noarch.rpm"
RPM_HASH = "169faaf07e22d01a0d31eabf5af9d803e945a36560d9293f750267156808f5b42add4e0883cb93a5e94a622fedd1073918168d9d0ab8ff184717ecde457ecde1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-keyvault \
python39-azure-keyvault \
python3dist-azure-keyvault"

RDEPENDS:${PN} += "python39-azure-keyvault-certificates \
python39-azure-keyvault-keys \
python39-azure-keyvault-nspkg \
python39-azure-keyvault-secrets \
python39-azure-nspkg"

inherit rpm
