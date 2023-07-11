SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python39-waitress-2.1.2-5.1.noarch.rpm"
RPM_HASH = "8c9235ab668f9ae9cfe03f535505eb1891c044bc5ed774a5509481ee1087b321f03812e5b2aaa9f4fa814c676077f21d8aeb2aff2c8bc86c0ed16e77abeb1443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-waitress \
python39-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
