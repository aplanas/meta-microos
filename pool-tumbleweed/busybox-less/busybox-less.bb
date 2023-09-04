SUMMARY = "Busybox applets replacing less"
DESCRIPTION = "This package contains the symlinks to replace less with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-less-1.36.1-28.1.noarch.rpm"
RPM_HASH = "8ac7afbc413b89d632fa27939bdf376260394b31fa6adda8a0ee4d15e94749b436d35929e24f15d444311ccbc3d0973c96b3143dcb43e4631fb0b57e918fbcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-less"

RDEPENDS:${PN} += "busybox"

inherit rpm
