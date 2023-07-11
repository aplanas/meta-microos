SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python310-check-manifest-0.49-4.3.noarch.rpm"
RPM_HASH = "04c2cb28b433de6ec45271c96aa3c39ed5f7c304d8c5e9ded99aa5e67e18dac2f75b22873f2c7deb7e17f369aaaba74d0ca3a39b00e19928ba896ead5b883a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-check-manifest \
python310-check-manifest \
python3dist-check-manifest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-build \
python310-setuptools \
python310-tomli \
update-alternatives"

inherit rpm
