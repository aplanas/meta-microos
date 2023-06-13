SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python39-waitress-2.1.2-4.1.noarch.rpm"
RPM_HASH = "336e2ff6e42cff6ae405af0baee57eb01965e692628d6d6d4aed26f52bff4def89ef8debb37a14ff2a5d2debf28978b7d794bd284b87d74da9d4199391b2bc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(waitress) \
python39-waitress \
python3dist(waitress)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi)"

inherit rpm
