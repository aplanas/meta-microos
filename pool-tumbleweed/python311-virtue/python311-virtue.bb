SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.5"

RPM_NAME = "python311-virtue-2023.7.5-1.1.noarch.rpm"
RPM_HASH = "6ca60ba9e243cfc010ed64b24423df07bf94c124acf41d2a7b4439d183f6d81bfe7f9764375258d1dd24099ec2831c3a7ec3e77cede96438db78a63d6e32aa32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtue \
python3.11dist-virtue \
python311-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Twisted \
python311-attrs \
python311-click \
python311-colorama \
python311-pyrsistent \
update-alternatives"

inherit rpm
