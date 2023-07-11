SUMMARY = "An API and command-line toolset for Twitter"
DESCRIPTION = "A Python API for Twitter, a command-line tool for getting others' \
tweets and setting your own tweet and an IRC bot that can announce Twitter \
updates to an IRC channel."
LICENSE = "MIT"

PV = "1.19.6"

RPM_NAME = "python311-twitter-1.19.6-1.5.noarch.rpm"
RPM_HASH = "f4444f00c2e7be1712fda5565b30965597719e7a3a2015bb3db7ec40a1db8bf19f98a460189219a31db3e4140ef1c347688ec04428dc0f40021c3b14579db82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twitter \
python3.11dist-twitter \
python311-twitter \
python3dist-twitter"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python3.11dist-certifi \
python3.11dist-setuptools \
update-alternatives"

inherit rpm
