SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-munch-3.0.0-1.3.noarch.rpm"
RPM_HASH = "3599edca1f82b3d6b3f51291dd1d17fbee062694e3c2108ae64af51ac924a8be82e29699a420b63bf43052aab26508aac24e5510682bafa86c83af9e2793d682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-munch \
python310-munch \
python3dist-munch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
