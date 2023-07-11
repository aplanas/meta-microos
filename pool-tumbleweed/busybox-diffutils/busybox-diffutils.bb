SUMMARY = "Busybox applets replacing diffutils"
DESCRIPTION = "This package contains the symlinks to replace diffutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-diffutils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "c0184237b87555cdd7acdca099919f5d008f50206615e6b691dc5f8703fe46aee3fe1343380a20bdef26f8707cffab79d2b173ee38581b83c32d7aa61241d45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-diffutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
