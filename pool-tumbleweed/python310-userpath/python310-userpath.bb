SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "Apache-2.0 | MIT"

PV = "1.7.0"

RPM_NAME = "python310-userpath-1.7.0-1.7.noarch.rpm"
RPM_HASH = "35277701e5c2dd03b5bd4612fcb1962f8dbdbe8d59e240689bcf8b6a7eb6e0eca559a3846a658c4c48e60da1b37f23ef2a4f7d4d04183f300daad6bf2adcb533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-userpath \
python3.10dist-userpath \
python310-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-click \
update-alternatives"

inherit rpm
