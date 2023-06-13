SUMMARY = "Widget for sensors"
DESCRIPTION = "Displays sensors information."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-sensors-2.1.5-3.3.noarch.rpm"
RPM_HASH = "f75f5136dcbdb9d201ab2d6a8ee7b9eecfc3bb6854c0d9a4addc08dc9e4e0008526da886b6ee768c4bb8b52a15140e6cbaba934b969154797eedfc37eca3390b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-sensors"

RDEPENDS:${PN} += "bumblebee-status \
sensors"

inherit rpm
