SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python311-tweepy-4.9.0-1.5.noarch.rpm"
RPM_HASH = "6dde2e539bb48dd05304f7ada1e2ae21369def77440afee6ccaf2bba1493c049136c281a547e1e1fc2d39495e3fa9531386a1399268d15afee63f5babe14f702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tweepy \
python3.11dist-tweepy \
python311-tweepy \
python3dist-tweepy"

RDEPENDS:${PN} += "-python3.11dist(oauthlib) < 4 with python3.11dist(oauthlib) >= 3.2 \
-python3.11dist(requests) < 3 with python3.11dist(requests) >= 2.27 \
-python3.11dist(requests-oauthlib) < 2 with python3.11dist(requests-oauthlib) >= 1.2 \
python-abi"

inherit rpm
