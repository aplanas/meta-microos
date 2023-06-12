SUMMARY = "An API and command-line toolset for Twitter"
DESCRIPTION = "A Python API for Twitter, a command-line tool for getting others' \
tweets and setting your own tweet and an IRC bot that can announce Twitter \
updates to an IRC channel."
LICENSE = "MIT"

PV = "1.19.6"

RPM_NAME = "python311-twitter-1.19.6-1.4.noarch.rpm"
RPM_HASH = "1d4f4bb79f0c5c58d3ca7048f99ebfbb38998dd70fc213af475c25b6271a982f691b90c1967b65548bff3d24c1d4839f3233a0902be016b34415928e4d8fc3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(twitter) \
python311-twitter \
python3dist(twitter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python3.11dist(certifi) \
python3.11dist(setuptools) \
update-alternatives"

inherit rpm
