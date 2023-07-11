SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python311-zhon-1.1.5-4.3.noarch.rpm"
RPM_HASH = "fa8aae62368689a6139121c1235834d111f8d8aa1c154415f169e602c0b2746a557164337c2406ac87937d731f574a8815664d69834073cde9c98988c88c5924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zhon \
python3.11dist-zhon \
python311-zhon \
python3dist-zhon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
