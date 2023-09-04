SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-userpath-1.9.0-1.1.noarch.rpm"
RPM_HASH = "0bc6dc51593bb9edddb89157c25c9098d78300f2087bf97c3d80c3b32d58c4ad74c135aed02317b92aa126eab39a4951eb2af9eda2ecaab75c83de84d28369e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-userpath \
python3.11dist-userpath \
python311-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
