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

RPM_NAME = "python310-azure-keyvault-4.2.0-1.8.noarch.rpm"
RPM_HASH = "e5eef5a910765c7ad44056e02c208936a8bf34ee19549c2fbac905173b8d7c6e092583aad2780f90acf4a2f416a4b147edea24b46a5a5033b1b11c173676fbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-keyvault \
python310-azure-keyvault \
python3dist-azure-keyvault"

RDEPENDS:${PN} += "python310-azure-keyvault-certificates \
python310-azure-keyvault-keys \
python310-azure-keyvault-nspkg \
python310-azure-keyvault-secrets \
python310-azure-nspkg"

inherit rpm
