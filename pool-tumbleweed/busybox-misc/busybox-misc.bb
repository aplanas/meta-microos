SUMMARY = "Busybox applets not fitting anywhere else"
DESCRIPTION = "This package contains the symlinks to provide various busybox applets which \
do not fit really to any other package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-misc-1.36.1-29.1.noarch.rpm"
RPM_HASH = "b51a40e216c176f6f96e1085cebfe06186902c850208db58ebf9a183b152583a2f55f84fd134168c04ea9c366c9eeb29637d248215e3cbca447f781a474dde7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-misc"

RDEPENDS:${PN} += "busybox"

inherit rpm
