SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.8.2"

RPM_NAME = "python39-virtue-2023.8.2-1.1.noarch.rpm"
RPM_HASH = "697dc6282d3efcd3fa2e45d4ae76962fe1664b5e256541b47e609f19031be4c53e136c20d6e5935c5668e83c9f3bc288c400ac478454ae94697696999a549c5d"
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
