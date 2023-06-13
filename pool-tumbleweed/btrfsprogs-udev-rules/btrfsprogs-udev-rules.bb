SUMMARY = "Udev rules for configuring btrfs file systems"
DESCRIPTION = "This package contains the udev rule file for configuring device mapper \
devices that are components of btrfs file systems.  It is meant to be \
used with versions of udev that contain the 'built-in' btrfs command \
(v190 and newer).  Older versions of udev will call the version of \
'btrfs ready' contained in the btrfsprogs package, which does the right \
thing."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-udev-rules-6.3-1.1.noarch.rpm"
RPM_HASH = "9a2684e3802dce159d3b72bed50c9d65942aa921f7c7e0b8ef10358a084c2053a822321e37be4fdb54cafef1fceb45d9e45349c207828fc1e5b9489a04c62907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsprogs-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
