SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-akismet-1.2.1-1.6.noarch.rpm"
RPM_HASH = "df2621a3794f8b6b1835a16f5b30393d2c60fd08b78409151361f5d2d36800ffb1a8de1a4fdba116a2beb663bc5ed7b73d46bf27eb84784b354c0842abda384f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-akismet \
python3.11dist-akismet \
python311-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
