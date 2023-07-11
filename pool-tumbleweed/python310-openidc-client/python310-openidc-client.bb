SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-openidc-client-0.6.0-1.13.noarch.rpm"
RPM_HASH = "89e2b33780f6b438aae047621d7c8dd62b60756c15778485cd8f93188ed18d3728781f154f83daa4c604493b9af37a908d00f84468245073e7c5c635facc8a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openidc-client \
python310-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
