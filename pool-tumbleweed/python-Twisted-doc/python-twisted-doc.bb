SUMMARY = "An asynchronous networking framework written in Python - Documentation"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This package contains the documentation for python-Twisted"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python-Twisted-doc-22.10.0-6.1.noarch.rpm"
RPM_HASH = "e2e0fe1ebf6261b09178cbf0906c621c1397740a530773a8ad462dc83c79186aec5ced6962869cbe27e3217fbbf730467368135dbe5215140f2618bacca08857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Twisted-doc"

RDEPENDS:${PN} += ""

inherit rpm
