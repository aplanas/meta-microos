SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20200713"

RPM_NAME = "python311-diff-match-patch-20200713-1.12.noarch.rpm"
RPM_HASH = "762606ea0c0e242393d88a504a70afc4fe95616bb78389631dbfa30429fe9780449f4962c6aeca87d814ba25e11dbfed3474be83622194ff0f6ad0560b228588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diff-match-patch \
python3.11dist-diff-match-patch \
python311-diff-match-patch \
python3dist-diff-match-patch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
