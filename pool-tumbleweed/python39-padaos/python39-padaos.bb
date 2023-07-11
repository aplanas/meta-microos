SUMMARY = "An intent parser"
DESCRIPTION = "A intent parser Python module. \
 \
Padaos converts a series of example sentences into one big chunk of \
regex. Each intent is a single compiled regex matcher."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-padaos-0.1.10-1.21.noarch.rpm"
RPM_HASH = "57167d061e3d81506bde01bba1b7650126668244d5348d30b9349c88ca0cf58d33b4c9d985fe0be0a22133eea7c608dccfee37e1ddda7b153ee5f6e58b716f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-padaos \
python39-padaos \
python3dist-padaos"

RDEPENDS:${PN} += "python-abi"

inherit rpm
