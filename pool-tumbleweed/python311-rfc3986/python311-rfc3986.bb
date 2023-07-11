SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python311-rfc3986-2.0.0-2.3.noarch.rpm"
RPM_HASH = "69827e10f498c0ddc817ab30c2d45ad6ebb3ba09cca2d05c3911b15367abb74a79488842e64a3b4426326c9317f404027b093f435b7f6fb42538e224481922d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3986 \
python3.11dist-rfc3986 \
python311-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
