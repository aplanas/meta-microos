SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "cpupower-rebuild-6.4.3-4.17.aarch64.rpm"
RPM_HASH = "c032c07fddbcd5e2481e2d1eece0937748425c6708845027f3da23f4493bd837163a157bf60d2ae286f42e4dd0aebb463ca1a341d71779e6ab94a96016a9e662"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
