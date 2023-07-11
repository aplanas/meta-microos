SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.20"

RPM_NAME = "python311-girder-client-3.1.20-1.2.noarch.rpm"
RPM_HASH = "86494f60aa8651a3620e509033ba00435b31ed12d174e50d4d7fb2c04b33315b3df3dc8ec5d7367218ae93c48a021ad66dfd428f7653acdbc185f1ff7619d524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-girder-client \
python3.11dist-girder-client \
python311-girder-client \
python3dist-girder-client"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-diskcache \
python311-requests \
python311-requests-toolbelt \
python311-six \
update-alternatives"

inherit rpm
