SUMMARY = "An asynchronous networking framework written in Python - Documentation"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This package contains the documentation for python-Twisted"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python-Twisted-doc-22.10.0-8.1.noarch.rpm"
RPM_HASH = "a4b5c58c4e6895fd57a8feddfd6a40810a8f2a3d3fc0685751cbe097f8f486eb6fdd4b60f16ee8164bf99b5d2393db95f3e18c2cd4922e4ddb4a31a50d382de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Twisted-doc"

RDEPENDS:${PN} += ""

inherit rpm
