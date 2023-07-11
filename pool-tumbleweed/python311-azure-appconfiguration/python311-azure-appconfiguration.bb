SUMMARY = "Microsoft App Configuration Data Library for Python"
DESCRIPTION = "Azure App Configuration is a managed service that helps developers centralize \
their application configurations simply and securely. \
 \
Modern programs, especially programs running in a cloud, generally have many \
components that are distributed in nature. Spreading configuration settings \
across these components can lead to hard-to-troubleshoot errors during an \
application deployment. Use App Configuration to securely store all the \
settings for your application in one place."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-azure-appconfiguration-1.4.0-1.4.noarch.rpm"
RPM_HASH = "14cbd5f7a47593b9e1bba461a62c39c41d44344eb9f604f1a923d3dcb4a3873013952e03854d0fcefdc7ca65cef2303c609d8febd597f6338883366cec07475c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-appconfiguration \
python3.11dist-azure-appconfiguration \
python311-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
