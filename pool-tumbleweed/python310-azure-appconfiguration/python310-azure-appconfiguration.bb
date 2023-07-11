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

RPM_NAME = "python310-azure-appconfiguration-1.4.0-1.4.noarch.rpm"
RPM_HASH = "61b0bb54a77c9d94c916a4981228ec473a3db4833d0184ae3c921d6be59c3a4ae8479df766fdb5d0871810d1a41e38c0afe217434acced00538df75a560c570a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-appconfiguration \
python310-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
