SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-attr-0.3.2-1.4.noarch.rpm"
RPM_HASH = "ce17cd22b65d45dae79047b567cc561f9d7402ee0414f6d88714e8c779e451efefcf4d7022b444f11b83bae6cf6519179fb04e40fa3f8b5aa906f930a8f0c566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(attr) \
python311-attr \
python3dist(attr)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
