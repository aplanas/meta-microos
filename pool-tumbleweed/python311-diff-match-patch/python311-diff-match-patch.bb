SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20200713"

RPM_NAME = "python311-diff-match-patch-20200713-1.11.noarch.rpm"
RPM_HASH = "c67ee68213c394c8a3d0bfa59a8fa83ba9a50da3538ac2246de8ab4751a80b4f621f6c79845a6fd452bd5b049cd74e42e62c7588137cf3e1b904746023ac3c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(diff-match-patch) \
python311-diff-match-patch \
python311-diff_match_patch \
python3dist(diff-match-patch)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
