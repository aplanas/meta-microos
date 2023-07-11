SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "Apache-2.0 | MIT"

PV = "1.7.0"

RPM_NAME = "python310-userpath-1.7.0-1.9.noarch.rpm"
RPM_HASH = "d5fa82a2254f03bcffd48f70324720bedbd8800a539cd6b4d2d18aae7217f7768fcb59bb5ace31bb5272aaac707aba2a3c455499044f64dfebf11f782fa0df77"
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
