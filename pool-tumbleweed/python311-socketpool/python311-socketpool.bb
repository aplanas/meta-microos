SUMMARY = "Python socket pool"
DESCRIPTION = "Socket pool is a socket pool that supports multiple factories and \
backends. It can be used by gevent, eventlet or any other library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python311-socketpool-0.5.3-9.10.noarch.rpm"
RPM_HASH = "41160abf484231164f48265e129c3a464e24bc4d05ad31351676c2c81b3b2dc5239a34d7101e7a4c412490ebec083deab59bf824f439c80e75ede8fc614caab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-socketpool \
python311-socketpool \
python3dist-socketpool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
