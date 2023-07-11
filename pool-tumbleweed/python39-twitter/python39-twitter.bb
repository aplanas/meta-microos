SUMMARY = "An API and command-line toolset for Twitter"
DESCRIPTION = "A Python API for Twitter, a command-line tool for getting others' \
tweets and setting your own tweet and an IRC bot that can announce Twitter \
updates to an IRC channel."
LICENSE = "MIT"

PV = "1.19.6"

RPM_NAME = "python39-twitter-1.19.6-1.5.noarch.rpm"
RPM_HASH = "ec5c273d1d84e906e2adb6ecf4fd76ae0a5f7e8d14b4e55f723f8e6c0406b5a7572c5d2de3e94532a29e03ec5e2b1925819d177be4d68983b571c882c3d0891c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-twitter \
python39-twitter \
python3dist-twitter"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python3.9dist-certifi \
python3.9dist-setuptools \
update-alternatives"

inherit rpm
