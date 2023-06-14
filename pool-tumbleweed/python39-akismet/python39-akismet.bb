SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-akismet-1.2.1-1.4.noarch.rpm"
RPM_HASH = "3a63263811a619c0c57fd7b4a7f89ae456b0f5664235101d2feae45911bd9e65d0ca6ac86819a87343becfd1bd1a2222c8d8e19d2960907c06b6a7f584e80a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-akismet \
python39-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
