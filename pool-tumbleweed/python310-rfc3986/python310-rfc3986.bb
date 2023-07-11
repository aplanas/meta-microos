SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python310-rfc3986-2.0.0-2.3.noarch.rpm"
RPM_HASH = "5a74576b40c96cb672be3123b9512e93ec5be0e3dbe8e4a2461f6102c8612dc2059e66bd752dec6ea30064eaf4b87744a9cce25d9a7affaf3ba06528f25be0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rfc3986 \
python310-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
