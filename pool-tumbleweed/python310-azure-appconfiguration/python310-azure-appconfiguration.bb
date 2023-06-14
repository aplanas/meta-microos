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

RPM_NAME = "python310-azure-appconfiguration-1.4.0-1.3.noarch.rpm"
RPM_HASH = "0d70a45b4136316c8dfba1083c65d698e193a8f1adb94efb455bfcd1576075e4d900538d5c283eb9f47760a6aafafcfbf49f94fd1d55ddee1bc841f75edf10e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-appconfiguration \
python3.10dist-azure-appconfiguration \
python310-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
