SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-three-merge-0.1.1-1.13.noarch.rpm"
RPM_HASH = "c7c3b7b3b7844a2dcf6c7dfb221540f31e0bf963407a3af64f542e743c0f5fb831362bb3e4a0c98e389f42f3222ccf86a48c6c30f067132cd2323d55eddb16ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-three-merge \
python39-three-merge \
python3dist-three-merge"

RDEPENDS:${PN} += "python-abi \
python39-diff-match-patch"

inherit rpm
