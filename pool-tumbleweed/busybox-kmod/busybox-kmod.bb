SUMMARY = "Busybox applets replacing kmod"
DESCRIPTION = "This package contains the symlinks to replace kmod with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-kmod-1.36.0-26.3.noarch.rpm"
RPM_HASH = "3fc30b24ec710c34fc27d6fd73eb8eafffb538155de25ff6f1d6cf71722bcb52b2b521a7b410eedafcb3b82aeac52cc71e4d3400d0d46247a039be92524d6f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/modprobe \
busybox-kmod"

RDEPENDS:${PN} += "busybox"

inherit rpm
