SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.4"

RPM_NAME = "python311-virtue-2023.7.4-1.1.noarch.rpm"
RPM_HASH = "0994166d107fe18f971b610c94be82217da14c6ab84113d1a99a369a338dbdaf906143c6d4ea4069cfac0a422cc4e644e3e5a0b2b5198a0f46ea8f21bafec78b"
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
