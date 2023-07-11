SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-three-merge-0.1.1-1.13.noarch.rpm"
RPM_HASH = "4118fc72250c944dfc03fd09ca05c2e265abf8e83f7dddace9a5aa863bd4e37ca81a5edc8feb9a7204767c932138d343919d9052da3557cbd353f0371dfe9dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-three-merge \
python3.11dist-three-merge \
python311-three-merge \
python3dist-three-merge"

RDEPENDS:${PN} += "python-abi \
python311-diff-match-patch"

inherit rpm
