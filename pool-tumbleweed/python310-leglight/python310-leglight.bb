SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-leglight-0.2.0-1.6.aarch64.rpm"
RPM_HASH = "1029700fbc36ce28a84c7118aa5f39aaa21b5c96f3db5bb73d2cb4f30bd8fcd6fda20185acd60cae5f6cd3c80c413ff8d836e2add81bf7618a5d6281f6216efb"

RPROVIDES:${PN} += "python3-leglight \
python3.10dist(leglight) \
python310-leglight \
python310-leglight(aarch-64) \
python3dist(leglight)"

RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-zeroconf"

inherit rpm
