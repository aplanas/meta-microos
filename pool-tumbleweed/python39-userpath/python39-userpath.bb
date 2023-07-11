SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "Apache-2.0 | MIT"

PV = "1.7.0"

RPM_NAME = "python39-userpath-1.7.0-1.9.noarch.rpm"
RPM_HASH = "f9a74ba764cae3554b83324a210b647981b51c0d054c919a3bea69dbd1c6f0df170091bf2f160f4e9bd2889a1e94df65a36a015eee2c0dacc4cde9e35826916d"
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
