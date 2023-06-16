SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.5.3"

RPM_NAME = "python39-virtue-2023.5.3-1.1.noarch.rpm"
RPM_HASH = "6782cbb6d3569f290f166dd7af0f551ccb1fb2da17cc676ff10d581628f232d56701b4514c29e8c2da0c562129d777fa2d2898b5a45b57fca15291baff2a002e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-virtue \
python39-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Twisted \
python39-attrs \
python39-click \
python39-colorama \
python39-pyrsistent \
update-alternatives"

inherit rpm
