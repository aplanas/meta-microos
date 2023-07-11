SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python39-yaswfp-0+git.1411687316.2a2cc6c-1.11.noarch.rpm"
RPM_HASH = "def2f6d50bacd0e0e1a98f4ef4e31c43e3a6fd61cd68add1692d2ecf9a72232d3a3ff1ad1d06a39fce7327729ff2745bf52ee0a92cf9b980f9011b1b0ffd82c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yaswfp \
python39-yaswfp \
python3dist-yaswfp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
