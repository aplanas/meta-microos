SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.8.2"

RPM_NAME = "python310-virtue-2023.8.2-1.1.noarch.rpm"
RPM_HASH = "b203097eb55c98ec4163c90c7687a4d189bf5fcc7a97ca05994fa969a38032c8b7d57b2260da15de289a20df630a31f89a7a2801d14aa96bce0dbe6a933f0d76"
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
