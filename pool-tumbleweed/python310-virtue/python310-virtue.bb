SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.5.3"

RPM_NAME = "python310-virtue-2023.5.3-1.1.noarch.rpm"
RPM_HASH = "8c71b599de6d971dc6bd715067ff6f11e797b2a222e02c4c9e6d79e7967e4d9aaebfe7a8427d916c0b25c8ed13e352afa24f8eaf36f193fd0b858f5af20a01e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtue \
python3.10dist(virtue) \
python310-virtue \
python3dist(virtue)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Twisted \
python310-attrs \
python310-click \
python310-colorama \
python310-pyrsistent \
update-alternatives"

inherit rpm
