SUMMARY = "Busybox applets replacing diffutils"
DESCRIPTION = "This package contains the symlinks to replace diffutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-diffutils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "11ffabd5c03dbb5dfef671397c329fcd749bc9876a96c8c768cf011e0a01fe69c3dc298b03def4cae850d2bdd77f8dc2fa0136ae73afeb2aa422d1f7593cb900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-diffutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
