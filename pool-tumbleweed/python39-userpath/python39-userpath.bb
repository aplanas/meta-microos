SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python39-userpath-1.9.0-1.1.noarch.rpm"
RPM_HASH = "660f02d5657ae9855cf0b545b9a13e505544b7471d75f2fdffb0008d5970601a196ed25f4223d206d69e51ce78b7de72c91d413a5d495554acf1dbba0baefea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-userpath \
python39-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
update-alternatives"

inherit rpm
