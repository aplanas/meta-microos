SUMMARY = "A Python wrapper around the Twitter API"
DESCRIPTION = "This library provides a Python interface for the Twitter API <https://dev.twitter.com/>. \
 \
Twitter <http://twitter.com> provides a service that allows people to connect via the web, IM, and SMS. Twitter exposes a web services API \
which can be used using this library."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "python310-python-twitter-3.5-2.10.noarch.rpm"
RPM_HASH = "05f5726960f83138e1889141457664c42cb8ca6edf4f22a5c3a77456f1d8654f120b2134f2cef327c509de088113ed01ffb6cf8aa8e04ea522cc77b781c0e440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-twitter \
python310-python-twitter \
python3dist-python-twitter"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-requests \
python310-requests-oauthlib"

inherit rpm
