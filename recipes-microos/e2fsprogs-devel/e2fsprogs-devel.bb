SUMMARY = "Dummy development package"
DESCRIPTION = "Dummy development package for backwards compatibility."
LICENSE = "LGPL-2.0-only"

PV = "1.46.5"

RPM_NAME = "e2fsprogs-devel-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "e7e38a224f109459d296308845f005db7431a7ff853856addd563c375cdd252ab6fb24ac1e2358681a30a45c7b705ac50c1200ae19af953aa7b267934f0168bc"

RPROVIDES:${PN} += "e2fsprogs-devel e2fsprogs-devel(aarch-64)"
RDEPENDS:${PN} += "libblkid-devel libext2fs-devel libuuid-devel"

inherit rpm
