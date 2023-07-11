SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python39-requests-kerberos-0.14.0-1.10.noarch.rpm"
RPM_HASH = "3ca9732172ca7da73efd931c8789fe7e2cb444135d19fe0769fc1c46196b923d7003feefaf9d31a1de34dc48b70bf4a6c91714e79c75150993a96abe4c48c494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-kerberos \
python39-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python39-pyspnego \
python39-requests"

inherit rpm
