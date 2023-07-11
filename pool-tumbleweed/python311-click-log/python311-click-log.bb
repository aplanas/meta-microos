SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-click-log-0.4.0-1.8.noarch.rpm"
RPM_HASH = "1bf4318a4f4fcc764fedcf5463a14d29cf0430be3a0687739c480d4adc0e2748c1e254264fc0e711004d0345029f8433bf6306722cfa23193a7e5a1770c8f60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-log \
python3.11dist-click-log \
python311-click-log \
python3dist-click-log"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
