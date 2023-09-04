SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.7"

RPM_NAME = "python310-rt-3.0.7-1.1.noarch.rpm"
RPM_HASH = "da45cecd33c1dc244e520e0bccaba89b17eea411e3b6e1202d5946cf1109d50e4451b937f2f127794424dadce832004bbe2a631edd3810a103be6a0b1c8754ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rt \
python310-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-requests-toolbelt"

inherit rpm
