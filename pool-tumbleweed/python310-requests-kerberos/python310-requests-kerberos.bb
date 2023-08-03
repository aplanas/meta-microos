SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python310-requests-kerberos-0.14.0-2.1.noarch.rpm"
RPM_HASH = "9a9399b771033c66ed74f276f86cdb66cdb6805909181959e537af7651e3826e14243541b82c4d0e3309be0d2e013def28daa4ed1d89e5b9f5d59d1d4f472667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-kerberos \
python310-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python310-pyspnego \
python310-requests"

inherit rpm
