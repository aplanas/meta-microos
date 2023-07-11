SUMMARY = "Basic immutable container types for Python"
DESCRIPTION = "Basic immutable container types for Python. \
 \
A simple implementation that's designed for simplicity over performance. \
 \
Use these in circumstances where it may result in more comprehensible code, or \
when you want to create custom types with restricted, immutable interfaces."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python39-itypes-1.2.0-2.1.noarch.rpm"
RPM_HASH = "c0e23913469e1b0feb1e136a72faef79bb6b673f68a81daa947f89653613f87ef914807034e67bff2c0de1fb1ba55b6c27d96076b1f63207f379fd521923360a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-itypes \
python39-itypes \
python3dist-itypes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
