SUMMARY = "An intent parser"
DESCRIPTION = "A intent parser Python module. \
 \
Padaos converts a series of example sentences into one big chunk of \
regex. Each intent is a single compiled regex matcher."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-padaos-0.1.10-1.19.noarch.rpm"
RPM_HASH = "5cfc2c01ef173ea22a96ad1d6c3e67005632eab52ebec84e7ac8b88b4dbeaec213851194d6dfe8c5cc726581cd604cc43e45baefc6025506dda6c09e647a1371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(padaos) \
python39-padaos \
python3dist(padaos)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
