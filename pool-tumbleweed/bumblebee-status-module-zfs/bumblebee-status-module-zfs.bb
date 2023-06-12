SUMMARY = "Shows zpool information"
DESCRIPTION = "Displays info about zpools present on the system."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-zfs-2.1.5-3.3.noarch.rpm"
RPM_HASH = "e074e5b2ea14df2dde6ecbd75b580f6ea64ad1b7a6500ff8499c483906d1eaf5317276a5d6153a6f5d2c51c761ed5c3be010e9e35c3bc576d8f0b62a1c83ac01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-zfs"
RDEPENDS:${PN} += "bumblebee-status \
python3-setuptools"

inherit rpm
