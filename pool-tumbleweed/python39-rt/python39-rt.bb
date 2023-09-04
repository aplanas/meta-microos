SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.7"

RPM_NAME = "python39-rt-3.0.7-1.1.noarch.rpm"
RPM_HASH = "d5e833394d76aaa45ccffbd2498648af56ddf89e14c9c98869ca860b4e2a73ac3732f1ab68a759f0adad8beed8c21a7e608d23c420c1617e9402a4d89d9a3a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rt \
python39-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-requests-toolbelt"

inherit rpm
