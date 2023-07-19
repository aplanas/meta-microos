SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.2"

RPM_NAME = "python39-virtue-2023.7.2-1.1.noarch.rpm"
RPM_HASH = "861d8f08f7078addae06ae7d1c963e0ed55551ac32dedc20dbb21d30e783f86d8d514535423d1a465381a399cfdc40c1cb6210e9d9ec28b08e8faa596a230680"
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
