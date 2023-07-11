SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python39-uritemplate-4.1.1-3.1.noarch.rpm"
RPM_HASH = "499aec0a1c6385e54e2a0cc7a2a5f0894d5565f7845a01efb555f25415f2aaed2e7d51c14e2d88fe74d34e69dd435beab23d462aaafd468ac02fc29523df31d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uritemplate \
python39-uritemplate \
python3dist-uritemplate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
