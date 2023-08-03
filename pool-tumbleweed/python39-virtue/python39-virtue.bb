SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.4"

RPM_NAME = "python39-virtue-2023.7.4-1.1.noarch.rpm"
RPM_HASH = "a3ae1ba0b77bf70961cc48ffee5b2a377c3cd42543fd8a3b0a6db4131a005b14aff8f2399c5e2b1459c5908fbf3b5e6982d3c972fa896a592381a9ebecfbacc6"
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
