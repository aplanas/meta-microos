SUMMARY = "Busybox applets replacing iproute2"
DESCRIPTION = "This package contains the symlinks to replace iproute2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iproute2-1.36.1-28.1.noarch.rpm"
RPM_HASH = "d4801222f32f6e4ddc7299f4d05c115f5a86401863c3682c8e73050491a780729e28f4079c7739a4c9378f99339a60b95c02482e92443c015a4b1d7aeaca314a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/ifup \
/sbin/ip \
busybox-iproute2"

RDEPENDS:${PN} += "busybox"

inherit rpm
