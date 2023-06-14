SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "Apache-2.0 | MIT"

PV = "1.7.0"

RPM_NAME = "python39-userpath-1.7.0-1.7.noarch.rpm"
RPM_HASH = "e1b29f9c1e852a5ccab11669c75d4e40538ac8a1135f4fb0568dbd10be3c7e0238f5c2b8c63ce214e2d595088bfebf347a25e4d2d3cbbb044464d54f0f56f639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-userpath \
python39-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-click \
update-alternatives"

inherit rpm
