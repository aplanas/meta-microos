SUMMARY = "A Python wrapper around the Twitter API"
DESCRIPTION = "This library provides a Python interface for the Twitter API <https://dev.twitter.com/>. \
 \
Twitter <http://twitter.com> provides a service that allows people to connect via the web, IM, and SMS. Twitter exposes a web services API \
which can be used using this library."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "python39-python-twitter-3.5-2.10.noarch.rpm"
RPM_HASH = "125f484e7b70465e90703cb5b2045a18f2d110027b756081ffa227bd6d053386e447d3222f9a609984f28a6349aad741649133bb063780c1e74bf43bd5858726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-twitter \
python39-python-twitter \
python3dist-python-twitter"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-requests \
python39-requests-oauthlib"

inherit rpm
