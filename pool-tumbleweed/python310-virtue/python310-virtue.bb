SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.5.3"

RPM_NAME = "python310-virtue-2023.5.3-1.3.noarch.rpm"
RPM_HASH = "477d877bb0e998ac744444c762f19edfeef30ab35362ef977676d96124c87b6db83883063bd749d3198da91d9c74acc6c94e1e69f6a50116966fded2c575bb21"
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
