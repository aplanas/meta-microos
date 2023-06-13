SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-click-spinner-0.1.10-2.3.noarch.rpm"
RPM_HASH = "4f99a6a5c2e644ecf9eabe8650bc9b4897965b5e1ed27f1622338298c2e76ed897c4d23ae0bc14ac152ef71682df0131d9f459db94148967171b195ff311222d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-spinner \
python3.10dist(click-spinner) \
python310-click-spinner \
python3dist(click-spinner)"

RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
