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

RPM_NAME = "python311-azure-keyvault-4.2.0-1.8.noarch.rpm"
RPM_HASH = "415044e0a3494a951a68ce81a8d98e30d142d2e7e015372e33dec6b5dd2497ae3c4749125f169836b64ef42cd3920a8f367471fe076ffeccabd33affa6629584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault \
python3.11dist-azure-keyvault \
python311-azure-keyvault \
python3dist-azure-keyvault"

RDEPENDS:${PN} += "python311-azure-keyvault-certificates \
python311-azure-keyvault-keys \
python311-azure-keyvault-nspkg \
python311-azure-keyvault-secrets \
python311-azure-nspkg"

inherit rpm
