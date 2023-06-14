SUMMARY = "Python socket pool"
DESCRIPTION = "Socket pool is a socket pool that supports multiple factories and \
backends. It can be used by gevent, eventlet or any other library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python39-socketpool-0.5.3-9.10.noarch.rpm"
RPM_HASH = "b5ed1d6386d00e63b41f3f8fa3c2dc8adfc48f2fb3f80bc877c60db1a4a8ce1c10b90980d76d382fd443efe3239d7107d434790b193919eb7f499589735dff1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-socketpool \
python39-socketpool \
python3dist-socketpool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
