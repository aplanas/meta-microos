SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-akismet-1.2.1-1.6.noarch.rpm"
RPM_HASH = "7601b07103393bfee5338b969446a64df5deac1f12a2864a032af2f84fdbb070fb8c54de93bc1fcbfcb12ce5f7b56a5e50ce92ba504e959c6fc6d97d9e14bed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-akismet \
python310-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
