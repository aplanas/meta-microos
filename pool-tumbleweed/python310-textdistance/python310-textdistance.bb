SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python310-textdistance-4.5.0-1.5.noarch.rpm"
RPM_HASH = "5731003af934db41ceb6e777be03c0a86f6cc4595ee77f5828406f4f8cfe37bbe091f12ee4f1afd4fcc2cd56dd6c5d14b413b12a36879041c545c80015930ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-textdistance \
python310-textdistance \
python3dist-textdistance"

RDEPENDS:${PN} += "python-abi"

inherit rpm
