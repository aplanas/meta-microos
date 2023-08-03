SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python39-waitress-2.1.2-6.1.noarch.rpm"
RPM_HASH = "5e2fd5417c6d04c0d391d4348a3c63f75e6c445f7f4bbf8b45107c3122d4e73f9ce8b0b84388b56d65ec4e02e0d027676a6d5e267876fa46bc2223b61c84f653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-waitress \
python39-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
