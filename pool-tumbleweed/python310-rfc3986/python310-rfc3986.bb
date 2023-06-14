SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python310-rfc3986-2.0.0-2.1.noarch.rpm"
RPM_HASH = "1c9080df444b1c41ae74457fc84d6a623e34370a93acfb553c990a4d34fe4fc977072a7a9c5db81da4b6b2a32777fedd53e05092fdaa10cbdb614943b6edc2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3986 \
python3.10dist-rfc3986 \
python310-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
