SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-munch-3.0.0-1.3.noarch.rpm"
RPM_HASH = "30771506e42dc0e27df8a3b51c22bb892a308855e2c5bab40e57371ca8ce264809b43a5470162736d2eb461a4b50b34fba08185230748b7155209ae1559a5835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-munch \
python3.11dist-munch \
python311-munch \
python3dist-munch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
