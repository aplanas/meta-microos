SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python310-uhashring-2.3-1.3.noarch.rpm"
RPM_HASH = "52d32651482aab114d93beb3c0da6ac89724ad5e42ab3a262d1c80e678d42a915318ff85c1fc4aedbdf35d74cc7b73c3e535988b7d824f9acb38e6ce759a0754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uhashring \
python310-uhashring \
python3dist-uhashring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
