SUMMARY = "Widget to toggle dunst notifications"
DESCRIPTION = "Widget to toggle dunst notifications."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-dunst-2.1.5-3.3.noarch.rpm"
RPM_HASH = "4a4d51a0b12018f074fb5af16f3b788940d63266204fdb5dc4f73a9cd520ec60935f99a0d8629234fe200d53b15bdb9ad8caab3fd605e235d3b619ac43eca2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-dunst"
RDEPENDS:${PN} += "bumblebee-status dunst"

inherit rpm
