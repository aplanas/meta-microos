SUMMARY = "A pass extension for importing data from most of the existing password manager"
DESCRIPTION = "A pass extension for importing data from most of the existing password manager."
LICENSE = "GPL-3.0-only"

PV = "3.3"

RPM_NAME = "pass-import-3.3-1.6.noarch.rpm"
RPM_HASH = "ec46383fc92f7fa0461559d9e15efd96217a836ad72a8cf30f4d6137bca5a7e76b40b83abb9ac8d2f4db469516255679e3c5ff3e3fb379c357f6700b2acb6440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pass-import \
python3.11dist-pass-import \
python3dist-pass-import"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-PyYAML"

inherit rpm
