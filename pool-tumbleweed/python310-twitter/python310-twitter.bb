SUMMARY = "An API and command-line toolset for Twitter"
DESCRIPTION = "A Python API for Twitter, a command-line tool for getting others' \
tweets and setting your own tweet and an IRC bot that can announce Twitter \
updates to an IRC channel."
LICENSE = "MIT"

PV = "1.19.6"

RPM_NAME = "python310-twitter-1.19.6-1.4.noarch.rpm"
RPM_HASH = "12e43bf27abb32922bcfa2ad8020e61ab8c6ac6056b8bd177c4fb9a028175a7251d1766ec48b8f47af6d781efb035569f9b74647c3322a068b33014844cbce49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twitter \
python3.10dist-twitter \
python310-twitter \
python3dist-twitter"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python3.10dist-certifi \
python3.10dist-setuptools \
update-alternatives"

inherit rpm
