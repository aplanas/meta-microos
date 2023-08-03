SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python311-waitress-2.1.2-6.1.noarch.rpm"
RPM_HASH = "8b31541eee403df7dad6667a4581257d12ed43e0c43c8a04682ffff2026f740a4efaaf7529d9179ae9fd96a3eac4ab56a1782dd22f8213b37c5ac05d6626e645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress \
python3.11dist-waitress \
python311-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
