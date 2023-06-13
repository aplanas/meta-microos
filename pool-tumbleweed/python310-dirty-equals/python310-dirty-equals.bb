SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-dirty-equals-0.5.0-1.3.noarch.rpm"
RPM_HASH = "587b142cd75c1dd67da46d647d4576613fdc41422d15d5b0c9b835e854363afec6711f8132361ef263a26c72da51195102f1e50a888877fa5400770c329fb323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dirty-equals \
python3.10dist(dirty-equals) \
python310-dirty-equals \
python3dist(dirty-equals)"

RDEPENDS:${PN} += "python(abi) \
python310-pytz"

inherit rpm
