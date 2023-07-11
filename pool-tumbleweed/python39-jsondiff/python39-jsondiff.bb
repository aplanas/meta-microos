SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-jsondiff-2.0.0-2.3.noarch.rpm"
RPM_HASH = "f7ec09acb68bdc2bbb636f27753ac6e391ffdb1a1e24d87a4e5b208c5b99a78a60eca944427ac0d205f871dbb9ceb25a0d9bd6dd93c725c2923e73b31d26f09e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsondiff \
python39-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
