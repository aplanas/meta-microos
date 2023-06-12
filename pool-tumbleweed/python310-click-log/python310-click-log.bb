SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-click-log-0.4.0-1.6.noarch.rpm"
RPM_HASH = "a844f927bac75acbf18d64aa6711e9a98d2b57831a88d5051f6a54ca7032c54f482f6b00dd59cfb78ba7343e7f45d91cdfab75a9eb7bf5c069e2e32e75ce7553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-log \
python3.10dist(click-log) \
python310-click-log \
python3dist(click-log)"
RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
