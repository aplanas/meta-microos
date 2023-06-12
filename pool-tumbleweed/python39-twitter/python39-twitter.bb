SUMMARY = "An API and command-line toolset for Twitter"
DESCRIPTION = "A Python API for Twitter, a command-line tool for getting others' \
tweets and setting your own tweet and an IRC bot that can announce Twitter \
updates to an IRC channel."
LICENSE = "MIT"

PV = "1.19.6"

RPM_NAME = "python39-twitter-1.19.6-1.4.noarch.rpm"
RPM_HASH = "aac5bee1d9244568353aebe4151928429e480c00d5c6cdef8afbe107e4fe3f0ff9dde81b62699efe475933fadf8e15e97efbe484e791daea95fa0ae80f4c4f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(twitter) \
python39-twitter \
python3dist(twitter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python3.9dist(certifi) \
python3.9dist(setuptools) \
update-alternatives"

inherit rpm
