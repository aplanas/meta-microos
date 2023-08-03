SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python39-requests-kerberos-0.14.0-2.1.noarch.rpm"
RPM_HASH = "519eef34297b2340d3b138c8ad7f13316d1679e33db7542b07729e7d67b6aa0125b92fa2909f36c8814bb4fd879771e2fd882fd526e200680e3200a2f8ac43d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-kerberos \
python39-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python39-pyspnego \
python39-requests"

inherit rpm
