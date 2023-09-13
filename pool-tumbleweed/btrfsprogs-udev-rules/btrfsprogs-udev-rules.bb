SUMMARY = "Udev rules for configuring btrfs file systems"
DESCRIPTION = "This package contains the udev rule file for configuring device mapper \
devices that are components of btrfs file systems.  It is meant to be \
used with versions of udev that contain the 'built-in' btrfs command \
(v190 and newer).  Older versions of udev will call the version of \
'btrfs ready' contained in the btrfsprogs package, which does the right \
thing."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "btrfsprogs-udev-rules-6.5-1.1.noarch.rpm"
RPM_HASH = "2d9447de94f1ecca21ee6f5fc51bf9a6c1f8cb3de4830b29317dfde84a4e09fb64413d096bfc8ceb2e144a3e6067cd6ece658169495ed215e290d7c88005aabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsprogs-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
