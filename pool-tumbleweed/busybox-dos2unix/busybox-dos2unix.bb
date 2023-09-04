SUMMARY = "Busybox applets replacing dos2unix"
DESCRIPTION = "This package contains the symlinks to provide dos2unix with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-dos2unix-1.36.1-28.1.noarch.rpm"
RPM_HASH = "beb3a894799c4ae4c928793b4362ee3fe65166f4fad2aa194b4e566da2122fa5d4a88d3d57d3caf2ac5e2cb4f79838333a8222fc8e4139af3ac448de59100f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-dos2unix"

RDEPENDS:${PN} += "busybox"

inherit rpm
