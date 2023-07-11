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

RPM_NAME = "python39-azure-appconfiguration-1.4.0-1.4.noarch.rpm"
RPM_HASH = "01ded727926e20d15f30dd52c8d6540a39676a4d3135c9faaae0a7a5a5041b6b3032e7d2697af146568283b28bbef31fdead17f6160e1cd848f4ab1d527f2c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-appconfiguration \
python39-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
