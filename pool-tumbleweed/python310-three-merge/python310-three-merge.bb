SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-three-merge-0.1.1-1.13.noarch.rpm"
RPM_HASH = "568b85d6230fe7dfa9be7a6fde160d4cebc7963148426b4498fb7f09462b9c847aa697ab338cbfa4d7cb4315bca1da0f2d44438775ad6fa1e372e557c5639bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-three-merge \
python310-three-merge \
python3dist-three-merge"

RDEPENDS:${PN} += "python-abi \
python310-diff-match-patch"

inherit rpm
