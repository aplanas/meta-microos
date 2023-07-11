SUMMARY = "Useful additions to futures, from the future."
DESCRIPTION = "Useful additions to futures, from the future. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "python3-futurist-2.4.1-1.6.noarch.rpm"
RPM_HASH = "c4ef6848311a3e37def64b6a1c306220d030678f4c7fde23ca070932d869320a06410ace59d95cda92c123d0ddc1640fc80f105a1cc341ec329c7bbdde10242a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-futurist \
python3.11dist-futurist \
python3dist-futurist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
