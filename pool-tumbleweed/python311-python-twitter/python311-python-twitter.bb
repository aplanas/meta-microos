SUMMARY = "A Python wrapper around the Twitter API"
DESCRIPTION = "This library provides a Python interface for the Twitter API <https://dev.twitter.com/>. \
 \
Twitter <http://twitter.com> provides a service that allows people to connect via the web, IM, and SMS. Twitter exposes a web services API \
which can be used using this library."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "python311-python-twitter-3.5-2.10.noarch.rpm"
RPM_HASH = "85006fb486ee03f388c610cd68c1f2bdfee8ca549fcb9f26073df1a94f1182118baa9c12ad2481278f83ea7768ddd9a01b697d2f0e91c9c498f784a6b4c1cb1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-twitter \
python3.11dist-python-twitter \
python311-python-twitter \
python3dist-python-twitter"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-requests \
python311-requests-oauthlib"

inherit rpm
