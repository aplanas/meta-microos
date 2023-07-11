SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.2.32"

RPM_NAME = "python39-cron-descriptor-1.2.32-1.5.noarch.rpm"
RPM_HASH = "1d1e0210d59cc105d69a37aa296a1b8a1bb0514ee980d3caaac3a11d6e0920b7c223d3c645a7d8db51de7d803dc975ae4e75da52e3898dc22c3d8de9d12647a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cron-descriptor \
python39-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
