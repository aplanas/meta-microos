SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python39-hypothesis-fspaths-0.1-2.10.noarch.rpm"
RPM_HASH = "551a6bc55e1da05f87beebd43676fe3437a74e38d06b8efd3382f2df48f77aa06681f4d7de029a0c4a10b269884e3df744c0742291faf106cff743937bb2fb26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hypothesis-fspaths \
python39-hypothesis-fspaths \
python3dist-hypothesis-fspaths"

RDEPENDS:${PN} += "python-abi \
python39-hypothesis"

inherit rpm
