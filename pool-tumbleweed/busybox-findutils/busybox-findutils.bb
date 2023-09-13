SUMMARY = "Busybox applets replacing findutils"
DESCRIPTION = "This package contains the symlinks to replace findutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-findutils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "ecefb0d46b30a0dfc48fe0f72b951285ffd63de9467a166c209f81d62e4a13d2f57d79a4e439663978571fd517b79f356cd05999fdf5857b153d77bfde19263a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-findutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
