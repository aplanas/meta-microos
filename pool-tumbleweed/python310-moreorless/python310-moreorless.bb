SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-moreorless-0.4.0-1.5.noarch.rpm"
RPM_HASH = "9f370f8fe69934c45549470241796198c96e35bd82c2edfeb34a9bbc17334a4b2d8226cfc1effae4a659fffd0ff8f1b60460edcd43feaa157a711d7f1bf6a2f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-moreorless \
python310-moreorless \
python3dist-moreorless"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-volatile"

inherit rpm
