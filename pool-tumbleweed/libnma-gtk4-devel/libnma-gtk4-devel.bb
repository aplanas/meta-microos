SUMMARY = "Development Files for libnma-gtk4"
DESCRIPTION = "Development Files for libnma-gtk4."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-devel-1.10.6-1.4.aarch64.rpm"
RPM_HASH = "c5242bfe18b3d86514273c177760dbf37057bedd33c8c592350104de3f9f86d4f5cbccd7757598ca36169791444050d492a01079aab6814e27144a909ed397c9"

RPROVIDES:${PN} += "libnma-gtk4-devel \
pkgconfig-libnma-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnma-devel \
libnma-gtk4-0 \
pkgconfig-libnm \
typelib-1-0-NMA4-1-0"

inherit rpm
