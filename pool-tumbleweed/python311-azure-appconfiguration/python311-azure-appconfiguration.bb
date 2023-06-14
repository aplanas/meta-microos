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

RPM_NAME = "python311-azure-appconfiguration-1.4.0-1.3.noarch.rpm"
RPM_HASH = "ea9126ad05ecf16aa5681d50ec16a8881332de503cdce0ce6170bd16822c4977f83f2361de3c6b51b626143b87911fa576de83538bf801f3ab5cb31eda3bfa62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-appconfiguration \
python311-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
