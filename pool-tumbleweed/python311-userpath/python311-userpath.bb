SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "Apache-2.0 | MIT"

PV = "1.7.0"

RPM_NAME = "python311-userpath-1.7.0-1.9.noarch.rpm"
RPM_HASH = "6d68c2e5507273051646c7dad5fdde1dad5c5ddda60c77d4c7d6be2056132c008fc68aa9e6a1a785635e0fdf3df8868a7643ea52d05eb5220ced415abe631ae9"
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
