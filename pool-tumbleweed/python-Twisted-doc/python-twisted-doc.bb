SUMMARY = "An asynchronous networking framework written in Python - Documentation"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This package contains the documentation for python-Twisted"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python-Twisted-doc-22.10.0-7.1.noarch.rpm"
RPM_HASH = "205b11ffefd12e0466d62563535a3701d20ab37d15d80a20393267779289714151226f305543e3a8432244e524036d049aee54d95147c336b42d52db5f981f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Twisted-doc"

RDEPENDS:${PN} += ""

inherit rpm
