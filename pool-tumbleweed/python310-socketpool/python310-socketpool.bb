SUMMARY = "Python socket pool"
DESCRIPTION = "Socket pool is a socket pool that supports multiple factories and \
backends. It can be used by gevent, eventlet or any other library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python310-socketpool-0.5.3-9.10.noarch.rpm"
RPM_HASH = "3d0a71068f4e0cc52b61d3babcd700e5bcef8925b378489102acec04d8ae1b6410fb5c014d19b6f58cf59c30733ad467f58bf796ec0fc4df058f278dddd16a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-socketpool \
python3.10dist(socketpool) \
python310-socketpool \
python3dist(socketpool)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
