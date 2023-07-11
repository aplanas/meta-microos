SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.20"

RPM_NAME = "python310-girder-client-3.1.20-1.2.noarch.rpm"
RPM_HASH = "b000b1a147032b58de27f5892eee23e0591bf056b2e461bfcef0bab94b8d561d57c3a9948d08c2586358c1257153386cfb7eeda0995b5365a87dab2062c155cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-girder-client \
python310-girder-client \
python3dist-girder-client"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-diskcache \
python310-requests \
python310-requests-toolbelt \
python310-six \
update-alternatives"

inherit rpm
