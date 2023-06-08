SUMMARY = "Udev rules for configuring btrfs file systems"
DESCRIPTION = "This package contains the udev rule file for configuring device mapper \
devices that are components of btrfs file systems.  It is meant to be \
used with versions of udev that contain the 'built-in' btrfs command \
(v190 and newer).  Older versions of udev will call the version of \
'btrfs ready' contained in the btrfsprogs package, which does the right \
thing."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "btrfsprogs-udev-rules-6.1.3-5.1.noarch.rpm"
RPM_HASH = "dfcadb867fb976d63934a3706adf443908f34fb55dc8a3c8983a704c901b6b527437c4e5697eeebea9c95855a63e717f8444aba2243b34bab63c3da802894c59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsprogs-udev-rules"
RDEPENDS:${PN} += ""

inherit rpm
