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

RPM_NAME = "python39-azure-appconfiguration-1.4.0-1.3.noarch.rpm"
RPM_HASH = "a4bc142971ea8378a4650bac810f68dec266d1dcc355df72e2fa55ce5a659c6df2b7c00241fb4704e45c25bfd896286c415bd4cfeeeb33606c2fbf93d1c9e618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-appconfiguration) \
python39-azure-appconfiguration \
python3dist(azure-appconfiguration)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
