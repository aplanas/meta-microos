SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20200713"

RPM_NAME = "python39-diff-match-patch-20200713-1.12.noarch.rpm"
RPM_HASH = "ce95b198ad3a376442fef2236b98e73c651e6c24e1b9a314d4dc19908f485bc0be11550b098fa671f6091bf4322752f1a591809def7a923ea96ad61f36c12c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-diff-match-patch \
python39-diff-match-patch \
python3dist-diff-match-patch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
