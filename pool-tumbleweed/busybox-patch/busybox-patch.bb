SUMMARY = "Busybox applets replacing patch"
DESCRIPTION = "This package contains the symlinks to replace patch with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-patch-1.36.0-26.3.noarch.rpm"
RPM_HASH = "6e05a9c6ed399235b0bd36a34e70c55513b2bee0e5972d9b4ae157aa7024d28af8ebcd59c43dd04c502b5d64fac45839ad829307e2ef32f30c6be33400480d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-patch"
RDEPENDS:${PN} += "busybox"

inherit rpm
