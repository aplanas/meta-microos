SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python39-rfc3986-2.0.0-2.3.noarch.rpm"
RPM_HASH = "72b12f52d9d0416cf844cb6af67ac69a39a055fc6c23f61a9a9cf454413425e8c812bb6c6c017976d5e1f429d3ff9451e9c730cc51fa9c65041f57911898815d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rfc3986 \
python39-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
