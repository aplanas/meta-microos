SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "Apache-2.0 | MIT"

PV = "1.7.0"

RPM_NAME = "python311-userpath-1.7.0-1.7.noarch.rpm"
RPM_HASH = "dac3650acb0731e81fa572e7d1934ed15525ffd542197155fbe205180700fe26a5010e7678882b5213cc92f053fca68e6540b8ece861c349b1220f9f70fc47fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(userpath) \
python311-userpath \
python3dist(userpath)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
update-alternatives"

inherit rpm
