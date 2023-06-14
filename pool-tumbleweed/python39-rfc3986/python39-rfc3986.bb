SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python39-rfc3986-2.0.0-2.1.noarch.rpm"
RPM_HASH = "50a177c70d3e2e491d75bf6d41d2bdeeba82e3f05d8a31244a7170e1245405032fd72e0ce35dd533b90ee5964adf8f91644126444ed6db30a84d7acb10ed2a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rfc3986 \
python39-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
