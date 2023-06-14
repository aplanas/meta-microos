SUMMARY = "A Python wrapper around the Twitter API"
DESCRIPTION = "This library provides a Python interface for the Twitter API <https://dev.twitter.com/>. \
 \
Twitter <http://twitter.com> provides a service that allows people to connect via the web, IM, and SMS. Twitter exposes a web services API \
which can be used using this library."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "python311-python-twitter-3.5-2.8.noarch.rpm"
RPM_HASH = "e3e5763eac7cf923f6538797e4904e78b4044ec206ef39f7d03da98e115350c2b698655bc594c06e7cec1f8b7dc2a71089aecd336882e76d341e5f45628feb23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-twitter \
python311-python-twitter \
python3dist-python-twitter"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-requests \
python311-requests-oauthlib"

inherit rpm
