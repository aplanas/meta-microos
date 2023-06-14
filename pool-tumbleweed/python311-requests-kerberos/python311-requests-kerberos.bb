SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python311-requests-kerberos-0.14.0-1.8.noarch.rpm"
RPM_HASH = "5ccf7b8e2e95c1537fe607e74b250e86693f6eefc0dd2cb3943b8c333b933794f73ff75e8ad2b655bb6f990d266a90f2c69bca7f3cfc192f2e064553005578d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requests-kerberos \
python311-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python311-pyspnego \
python311-requests"

inherit rpm
