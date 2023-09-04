SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-userpath-1.9.0-1.1.noarch.rpm"
RPM_HASH = "edc9fc4336ac21014239213108ce100b238a86cffc3145e8de3592b22cc39dea90954a940dcc55fb6ed3e9e47cfa0ac4eeee794c576f5a7d440c3e52f199534f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-userpath \
python310-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
