SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.20"

RPM_NAME = "python39-girder-client-3.1.20-1.2.noarch.rpm"
RPM_HASH = "9b20a82f619a1753dfd6aa2cffe29deb939319171458eb0b524caad28312fe4d7736142e59687e76d39d62f6e02bf6e98fceefc4c455982615764113dbd510d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-girder-client \
python39-girder-client \
python3dist-girder-client"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-diskcache \
python39-requests \
python39-requests-toolbelt \
python39-six \
update-alternatives"

inherit rpm
