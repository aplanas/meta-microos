SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python310-jsonlines-3.1.0-2.1.noarch.rpm"
RPM_HASH = "21c2def83dc57d2a25ca39226eeba22d17ce042915c457244feb1e5e76b10d7560e1341c2f95a470352855d6c5b5aa98fc85ac52505427c9ecd4236642c234e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonlines \
python310-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi"

inherit rpm
