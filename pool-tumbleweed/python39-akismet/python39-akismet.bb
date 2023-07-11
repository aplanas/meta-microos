SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-akismet-1.2.1-1.6.noarch.rpm"
RPM_HASH = "c7871bbd820732a4d16cbf0f0c7de0b93859649cdbec6ddbbc779c091f21366000bee2302e27551ad535a7fe5dbea75fce6ff2325d51cc0550903e6fe717fb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-akismet \
python39-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
