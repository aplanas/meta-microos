SUMMARY = "Udev rules for configuring btrfs file systems"
DESCRIPTION = "This package contains the udev rule file for configuring device mapper \
devices that are components of btrfs file systems.  It is meant to be \
used with versions of udev that contain the 'built-in' btrfs command \
(v190 and newer).  Older versions of udev will call the version of \
'btrfs ready' contained in the btrfsprogs package, which does the right \
thing."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-udev-rules-6.3-3.1.noarch.rpm"
RPM_HASH = "105fd870773410aa09e8a42172b3152df14c1a860fd437a8d5bfc41796adb572d906c50ec1efa62a2e6da4b670fb44401d68e5bcdaead2b442dca34f396b4c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsprogs-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
