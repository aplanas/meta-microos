SUMMARY = "Udev rules for configuring btrfs file systems"
DESCRIPTION = "This package contains the udev rule file for configuring device mapper \
devices that are components of btrfs file systems.  It is meant to be \
used with versions of udev that contain the 'built-in' btrfs command \
(v190 and newer).  Older versions of udev will call the version of \
'btrfs ready' contained in the btrfsprogs package, which does the right \
thing."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-udev-rules-6.3-2.2.noarch.rpm"
RPM_HASH = "add61dfe48bee78eae8f231f3d81b44edfd03d510a208e563cc5f78b97f58d1b779380f939d9a173cc3a7f2cee9d83d3a8191298f932bc59f16880efff9228af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsprogs-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
