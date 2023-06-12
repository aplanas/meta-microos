SUMMARY = "Widget to toggle twmn notifications"
DESCRIPTION = "Widget to toggle twmn notifications."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-twmn-2.1.5-3.3.noarch.rpm"
RPM_HASH = "d4f5217e0091f4066ffa473b1b78d361334b1620082735ff02601b2862147ab30bf2650fd6e87271ff70d81bb287ae15afdb56fb6c86049ab7102f48aa78d979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-twmn"
RDEPENDS:${PN} += "bumblebee-status \
systemd"

inherit rpm
