SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python311-waitress-2.1.2-5.1.noarch.rpm"
RPM_HASH = "ea383bad4f839c6a34c4c581b0087bf63b08f5c354f2691d6991d3a7232329736e7be4775a1c1513d1cd8e1465d9816789ffd9fe687d0609b697c6dcc1182777"
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
