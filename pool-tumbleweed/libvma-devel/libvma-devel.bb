SUMMARY = "Header files and link required to develop with Libvma"
DESCRIPTION = "Headers and symbolink link required to compile and link with the Libvma library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.7.0"

RPM_NAME = "libvma-devel-9.7.0-2.2.aarch64.rpm"
RPM_HASH = "2f10f37cb3220ff5c33215c8c0a1be3262643a5b14e2d0b07ed1f781748537d6061a160553e883e6395e7c067cf3403338f7bb0ab8bf3661ebcedc88dc05e7c5"

RPROVIDES:${PN} += "libvma-devel"

RDEPENDS:${PN} += "libvma9"

inherit rpm
