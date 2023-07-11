SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20200713"

RPM_NAME = "python310-diff-match-patch-20200713-1.12.noarch.rpm"
RPM_HASH = "1501ed0b92cf62f5a796076cbe8db886a57a39415e9add9582a1d6f5065aa14dcd0ca7218888d50edbf393776d74e53002620b152ace7a9636b8e2fb8fa99ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-diff-match-patch \
python310-diff-match-patch \
python3dist-diff-match-patch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
