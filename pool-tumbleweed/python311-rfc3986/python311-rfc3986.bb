SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python311-rfc3986-2.0.0-2.1.noarch.rpm"
RPM_HASH = "50074eac59a5533c6134a447b9851942eff8bd7072bd93619f234563a3db2964e879ef28f0112301f3b8a959fee849001eab3fdb88fc05f5e4178760c000741a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rfc3986) \
python311-rfc3986 \
python3dist(rfc3986)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
