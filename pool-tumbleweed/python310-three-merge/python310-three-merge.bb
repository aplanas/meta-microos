SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-three-merge-0.1.1-1.11.noarch.rpm"
RPM_HASH = "43b56fe047ae6cec0cc9503157bc504ccff465ca79dd04140226fa94017e7c9656146b1037e8d3b4c20426cb140884d3afdf4f03d9323fad27fc736087ea14dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-three-merge \
python3.10dist(three-merge) \
python310-three-merge \
python3dist(three-merge)"
RDEPENDS:${PN} += "python(abi) \
python310-diff-match-patch"

inherit rpm
