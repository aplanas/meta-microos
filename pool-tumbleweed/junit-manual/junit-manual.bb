SUMMARY = "Manual for junit"
DESCRIPTION = "Documentation for junit."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-manual-4.13.2-4.2.noarch.rpm"
RPM_HASH = "bc63316e209841927547ac28ea52e919cfc3035b01db8b40edb0073cbdff8432b9a81d59e90b427f1e67d2fb5637a54bd46528b3b27c589344edcdd6e505a68b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit-manual \
junit4-manual"

RDEPENDS:${PN} += ""

inherit rpm
