SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20200713"

RPM_NAME = "python310-diff-match-patch-20200713-1.11.noarch.rpm"
RPM_HASH = "ba351f3f5a7dc1de1b63fd65c090c141ddd05a89c6019d63e6677ca92e8f69dc2a7e137ddae21bb1c4f897c7b93d382c63a4da56421e19c1103f50146f3bb944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diff-match-patch \
python3-diff_match_patch \
python3.10dist(diff-match-patch) \
python310-diff-match-patch \
python310-diff_match_patch \
python3dist(diff-match-patch)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
