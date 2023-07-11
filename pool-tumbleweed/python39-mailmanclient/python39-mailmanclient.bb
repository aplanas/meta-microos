SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.5"

RPM_NAME = "python39-mailmanclient-3.3.5-1.1.noarch.rpm"
RPM_HASH = "49ffe4c6544581a8818f854f5d19a41ace3a8b666c409867d76a11e90e08e28b550c5c32bc9b5661753954d415013942fbd540640fa9285ca3ebfe05bdf6da05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mailmanclient \
python39-mailmanclient \
python3dist-mailmanclient"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
