SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python310-tweepy-4.9.0-1.5.noarch.rpm"
RPM_HASH = "4d5bc1c5efec046f9f76ee30e24695fc5bbc222e0f16b56d4a55ffd54037ef2c4324056f1b4acb72fae5541d1491ef3f4368a4a8d3c6d018d4ad83737a6896e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tweepy \
python310-tweepy \
python3dist-tweepy"

RDEPENDS:${PN} += "-python3.10dist(oauthlib) < 4 with python3.10dist(oauthlib) >= 3.2 \
-python3.10dist(requests) < 3 with python3.10dist(requests) >= 2.27 \
-python3.10dist(requests-oauthlib) < 2 with python3.10dist(requests-oauthlib) >= 1.2 \
python-abi"

inherit rpm
