SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python39-tweepy-4.9.0-1.4.noarch.rpm"
RPM_HASH = "d2f5c37fccd11be801e4d72fcaa13f66ac4e2dd92e73aa1ab4bb30c84b4818d6b546b17cbc65785f0cc44950bbf13f47bd1e6f2d0dd33bd0ab229eae36acad72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tweepy) \
python39-tweepy \
python3dist(tweepy)"

RDEPENDS:${PN} += "(python3.9dist(oauthlib) < 4 with python3.9dist(oauthlib) >= 3.2) \
(python3.9dist(requests) < 3 with python3.9dist(requests) >= 2.27) \
(python3.9dist(requests-oauthlib) < 2 with python3.9dist(requests-oauthlib) >= 1.2) \
python(abi)"

inherit rpm
