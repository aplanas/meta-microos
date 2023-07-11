SUMMARY = "A few extensions to pyyaml"
DESCRIPTION = "A few extensions to pyyaml."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-aspy.yaml-1.3.0-2.10.noarch.rpm"
RPM_HASH = "d73ad598f81bd31510fbafd2b370d3669a06dda5f45afe7f53c58c0c70c0513642782871f81ad8d56c17c972ca2aa1b370bbbcf4c0127f026b9b2c2bd94ae688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aspy.yaml \
python39-aspy.yaml \
python3dist-aspy.yaml"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
