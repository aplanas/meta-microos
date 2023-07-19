SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.2"

RPM_NAME = "python311-virtue-2023.7.2-1.1.noarch.rpm"
RPM_HASH = "21b95eef42982693dde4d8bb4201e4a7b7c90345a0589b5724ec6ade21c469f2e18a2f3394b04229cfaba63de1cbcd4fffbb5d1287b47e718209af9821edc909"
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
