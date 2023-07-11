SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-wakeonlan-3.0.0-1.3.noarch.rpm"
RPM_HASH = "6e77c042b16e5672f29aac1766f5630fd3dde26ae448c30b7dadfd739610f93696d5b78dff826fe3ead27114bee5386e2a44d80a4dc841ac7f521201008e1228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wakeonlan \
python310-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
