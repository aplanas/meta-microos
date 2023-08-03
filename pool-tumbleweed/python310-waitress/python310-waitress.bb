SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python310-waitress-2.1.2-6.1.noarch.rpm"
RPM_HASH = "86a78cbad4219bf72e2fbfad6d47a65d7e7b225d0a23d5c7c4d9e1b29e11ce1c1ed6941de9440c059c7fef0fd0a080e5e1dd8430a9986167abddbeb5979f6aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-waitress \
python310-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
