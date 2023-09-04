SUMMARY = "Busybox applets replacing cpio"
DESCRIPTION = "This package contains the symlinks to replace cpio with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-cpio-1.36.1-28.1.noarch.rpm"
RPM_HASH = "d73d97917573d4b41bc0a931e1b558fd3f7321160b6d3ce6812baaf5ed56a79a049ccecae2bcf72a5ac8a2193f689cd56952c7dd116fcaf340a03e487a04710c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-cpio"

RDEPENDS:${PN} += "busybox"

inherit rpm
