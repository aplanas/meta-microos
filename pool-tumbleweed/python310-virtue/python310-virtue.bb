SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.2"

RPM_NAME = "python310-virtue-2023.7.2-1.1.noarch.rpm"
RPM_HASH = "265e8257040f63c65418bebbe17fde22e2955cd4feb0a21d2ed7c4ae1602e926668f2696fd4c5bc883ca6ca1f0d419b0f1db9380179e135868ce899c176a0bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-virtue \
python310-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Twisted \
python310-attrs \
python310-click \
python310-colorama \
python310-pyrsistent \
update-alternatives"

inherit rpm
