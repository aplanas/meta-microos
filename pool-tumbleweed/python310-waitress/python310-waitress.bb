SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python310-waitress-2.1.2-4.1.noarch.rpm"
RPM_HASH = "3c6ded4f778bc11866f6d7152c107c0a33dbc198ddb1dd9e9ea9d9dcf0bcaaa23614ba21a1a5883fbca1dc623d7758ad8d2ebf6b345323a76416b040f7a19f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress \
python3.10dist-waitress \
python310-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
