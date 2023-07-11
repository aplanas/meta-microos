SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-requests-unixsocket-0.3.0-3.3.noarch.rpm"
RPM_HASH = "dcc7cfec69ba6af98d6c39d72ce3d74babfcfa30c9ecbfe719a4302adeda62f63a5c8035f651391d9b25749ce072a764d5f3d8459fd51f7a0787f3418e5d1848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-unixsocket \
python39-requests-unixsocket \
python3dist-requests-unixsocket"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python39-requests"

inherit rpm
