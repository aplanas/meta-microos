SUMMARY = "Busybox applets replacing man"
DESCRIPTION = "This package contains the symlinks to replace man with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-man-1.36.1-30.1.noarch.rpm"
RPM_HASH = "65c061078e2f619b74955c800249ef064f8b53ef10d89bb3d6b1762968a92ab948c30797e46a1430e6dfc237728c6d7ca62a2a29d89e27f697af0da3de2f0bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-man"

RDEPENDS:${PN} += "busybox"

inherit rpm
