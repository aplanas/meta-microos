SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.5.3"

RPM_NAME = "python39-virtue-2023.5.3-1.3.noarch.rpm"
RPM_HASH = "6bd092ed12d84851c807f9b5ed03cd92dd540df1befc67231612f7d6c2abda139896f6ce95e156462009808cdaf3a7eb93ffa699f92c89895ef2e37b77c92e88"
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
