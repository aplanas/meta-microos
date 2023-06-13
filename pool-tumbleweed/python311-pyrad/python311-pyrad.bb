SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python311-pyrad-2.4-3.8.noarch.rpm"
RPM_HASH = "0a093375311d0a83bd3e6f23f64f962b181de7f9131ece9ff0def7c28b8548225c4d0eea5fd30a5c20a94227381520d3e8978ea02a045dd4f6d2d4abdca483c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyrad) \
python311-pyrad \
python3dist(pyrad)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
