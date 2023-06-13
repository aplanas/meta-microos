SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-three-merge-0.1.1-1.11.noarch.rpm"
RPM_HASH = "77f2c5516e20a24ff69c4194fc8a8388ad42664781250b6f15ab0d334b94f482b677022ce62c9ce31f58a5184660410ff92968fc58b992148c212c4f0cd91b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(three-merge) \
python39-three-merge \
python3dist(three-merge)"

RDEPENDS:${PN} += "python(abi) \
python39-diff-match-patch"

inherit rpm
