SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python310-tweepy-4.9.0-1.4.noarch.rpm"
RPM_HASH = "bb7c32b58a8512896f3045cd19015d36270f27d764573057818d2a75bbbcea79b18f9b04ea8792d64ec65f7dde935cbf5de67c86830051fd753ed40aaf02b519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tweepy \
python3.10dist(tweepy) \
python310-tweepy \
python3dist(tweepy)"
RDEPENDS:${PN} += "(python3.10dist(oauthlib) < 4 with python3.10dist(oauthlib) >= 3.2) \
(python3.10dist(requests) < 3 with python3.10dist(requests) >= 2.27) \
(python3.10dist(requests-oauthlib) < 2 with python3.10dist(requests-oauthlib) >= 1.2) \
python(abi)"

inherit rpm
