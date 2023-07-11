SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python311-requests-kerberos-0.14.0-1.10.noarch.rpm"
RPM_HASH = "634fd8349c2876f4287c163c088ce317addbf2fb6f7f202c5f6a7dbe89744fd1f24ee2a86268c9775ba1d5231600939f9a8593d3be90f9f9f59888d0874e088c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-kerberos \
python3.11dist-requests-kerberos \
python311-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python311-pyspnego \
python311-requests"

inherit rpm
