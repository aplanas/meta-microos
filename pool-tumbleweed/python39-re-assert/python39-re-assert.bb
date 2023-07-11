SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-re-assert-1.1.0-2.3.noarch.rpm"
RPM_HASH = "cd58a742094ac3641c4680f6fdd674fe32a507b49135024d5a62277d075c790bbc7f1f7782265cb08ed82fbf333b4b17206c3f7a874214e00515b3c9d5d6ae7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-re-assert \
python39-re-assert \
python3dist-re-assert"

RDEPENDS:${PN} += "python-abi \
python39-regex"

inherit rpm
