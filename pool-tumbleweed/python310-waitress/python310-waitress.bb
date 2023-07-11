SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python310-waitress-2.1.2-5.1.noarch.rpm"
RPM_HASH = "b1f360d1da28233a57196c7023ce033e2f2fe2779ce0f9277e8d6b39072637f3fbfde7fbbfa00f838f43f062a35cb60c20b13244afb11a992946dc8683c7c1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-waitress \
python310-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
