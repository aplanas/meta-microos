SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-linetable-0.0.3-1.3.noarch.rpm"
RPM_HASH = "2bdff66a810fecaa90b408c824b9743f087fbc4bf80be32619c36658bf90707b9dcd64c263f846bf5725bcfd670525558338f7a21e9a499bd029c78c2fe7e288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linetable \
python3.11dist-linetable \
python311-linetable \
python3dist-linetable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
