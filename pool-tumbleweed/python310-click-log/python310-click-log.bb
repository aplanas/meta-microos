SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-click-log-0.4.0-1.8.noarch.rpm"
RPM_HASH = "72b747ae18fbea9447c7bfc95915a8d88be8ea4b142705a3e941a68e77dd9cced1f2e723a836220373e5340d837966fdccba6fc506ecf8275b7874dc6bd9a3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-log \
python310-click-log \
python3dist-click-log"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
