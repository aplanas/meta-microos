SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-pydyf-0.7.0-1.1.noarch.rpm"
RPM_HASH = "502480d307353cc6c9d899a9c379cd3fda59bd004d9be658040cc2b1ba8a911c43c079090ac61c8c511eecdf31115fe3699776193d7fe5369ac9e31ad89d7729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydyf \
python3.11dist-pydyf \
python311-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
