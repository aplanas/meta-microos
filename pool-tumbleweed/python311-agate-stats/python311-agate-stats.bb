SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-agate-stats-0.4.0-3.4.noarch.rpm"
RPM_HASH = "c8efea3527c43bdc7a82e9d053d808b12ec2c6f13433e6b93ae6814fce21ff8ebbe1bcc6d2564525b4a06db8db72a488e51b3e91354eae7bd3fe46340424ea54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-stats \
python3.11dist-agate-stats \
python311-agate-stats \
python3dist-agate-stats"

RDEPENDS:${PN} += "python-abi \
python311-agate \
python311-six"

inherit rpm
