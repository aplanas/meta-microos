SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python39-tweepy-4.9.0-1.5.noarch.rpm"
RPM_HASH = "b31e6ccc5c5dceceec72fe89b051edac9dbf77d74f68ebaf8b558ca65aee529a67b673f9437bcfb9e4b03cb1b27c62d06d69723fa940987a44cd3d1575728193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tweepy \
python39-tweepy \
python3dist-tweepy"

RDEPENDS:${PN} += "-python3.9dist(oauthlib) < 4 with python3.9dist(oauthlib) >= 3.2 \
-python3.9dist(requests) < 3 with python3.9dist(requests) >= 2.27 \
-python3.9dist(requests-oauthlib) < 2 with python3.9dist(requests-oauthlib) >= 1.2 \
python-abi"

inherit rpm
