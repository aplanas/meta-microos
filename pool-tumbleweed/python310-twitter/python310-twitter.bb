SUMMARY = "An API and command-line toolset for Twitter"
DESCRIPTION = "A Python API for Twitter, a command-line tool for getting others' \
tweets and setting your own tweet and an IRC bot that can announce Twitter \
updates to an IRC channel."
LICENSE = "MIT"

PV = "1.19.6"

RPM_NAME = "python310-twitter-1.19.6-1.5.noarch.rpm"
RPM_HASH = "ba36e5a8fd8ae17e6f15119f0322ac288ef9321a72a57a275750472cb70b12c32864b1760af02b2d77487bbdaabcf28e63e6e91571ec07a1eaa02089f36897b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-twitter \
python310-twitter \
python3dist-twitter"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3.10dist-certifi \
python3.10dist-setuptools \
update-alternatives"

inherit rpm
