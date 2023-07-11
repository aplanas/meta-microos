SUMMARY = "Python socket pool"
DESCRIPTION = "Socket pool is a socket pool that supports multiple factories and \
backends. It can be used by gevent, eventlet or any other library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python310-socketpool-0.5.3-9.12.noarch.rpm"
RPM_HASH = "2892f7104b6dfd83ba29c6286b8bdee3b13a17376a6fbb6c8c6705706bf5e643d526065bf9a03ed7c9c6e0bcb2ea42d46437e47cf5c9e5bf673be4f166e02e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-socketpool \
python310-socketpool \
python3dist-socketpool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
