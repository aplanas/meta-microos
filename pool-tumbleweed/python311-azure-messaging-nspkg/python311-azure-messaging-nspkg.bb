SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-messaging-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "d111067b3ed3a8e6fbc9ce79eb30f25a92e27baace8c4090ec5f4fa6cedda18e5e66b5f704ea6899cef447ffcde7d4223bebc71158484a8dc8b02b8203fc82ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-nspkg \
python3.11dist-azure-messaging-nspkg \
python311-azure-messaging-nspkg \
python3dist-azure-messaging-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
