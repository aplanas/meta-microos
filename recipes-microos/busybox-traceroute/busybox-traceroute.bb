SUMMARY = "Busybox applets replacing traceroute"
DESCRIPTION = "This package contains the symlinks to replace traceroute with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-traceroute-1.36.0-26.3.noarch.rpm"
RPM_HASH = "7266b31206fd6fc21edf6e3ad1f40a409db8f61080e808ab5052216409ab464aa4d34cfa8d174a091026e5dc04f7316e1b1f84a2bb6e7bd35fcef95c55d5a280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-traceroute"
RDEPENDS:${PN} += "busybox"

inherit rpm
