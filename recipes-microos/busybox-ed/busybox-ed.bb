SUMMARY = "Busybox applets replacing ed"
DESCRIPTION = "This package contains the symlinks to provide ed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-ed-1.36.0-26.3.noarch.rpm"
RPM_HASH = "67598a7354ebfcce9611a5b35acec10f047c5ea39018f1aa6c05dfecd8692492010ff80fdb5ffb2f594f438a99c7e8b26f5267549f32cfe53f2c4e84903ee9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ed"
RDEPENDS:${PN} += "busybox"

inherit rpm
