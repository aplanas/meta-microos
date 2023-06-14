SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-akismet-1.2.1-1.4.noarch.rpm"
RPM_HASH = "4c42693563a3b0a675eb9100a135b6f445599b24b99f21387e0e7fd5c7403fc09f6ddde04d5f2963bfd83e731daf39f6e8505bc58e251434f78938fc71dca72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-akismet \
python3.10dist-akismet \
python310-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
