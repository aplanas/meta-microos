SUMMARY = "Displays of Logitech's unifying device"
DESCRIPTION = "Displays status and load percentage of Logitech's unifying device."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-solaar-2.1.5-3.3.noarch.rpm"
RPM_HASH = "7fe2aa4fbc96a97bb54a10d9c6722fbf17cec0ad903c918f5127d4d4de0263800b27cbbea06944fd20e9482f3347dcc61ce1a8ea41df6e540d0ee4020995e936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-solaar"
RDEPENDS:${PN} += "bumblebee-status \
solaar"

inherit rpm
