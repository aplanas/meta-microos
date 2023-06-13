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

RPM_NAME = "python310-azure-keyvault-4.2.0-1.6.noarch.rpm"
RPM_HASH = "9e281c5fb67be886bf1ccb560c2bc7d85d837424e9cbfb34d1a7e3dd9c7f891b23dc37edc12101554d63059a2182ca44d50506d25509c4d4e55274c37f1f9f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault \
python3.10dist(azure-keyvault) \
python310-azure-keyvault \
python3dist(azure-keyvault)"

RDEPENDS:${PN} += "python310-azure-keyvault-certificates \
python310-azure-keyvault-keys \
python310-azure-keyvault-nspkg \
python310-azure-keyvault-secrets \
python310-azure-nspkg"

inherit rpm
