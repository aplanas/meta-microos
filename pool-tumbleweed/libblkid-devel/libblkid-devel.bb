SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid-devel-2.39-2.1.aarch64.rpm"
RPM_HASH = "583fd44765b4f2f50a3825e82341bd46c51dfd125e6c08e4e2eca71aebe466ad32278ca593d28c278976f692c3bf248e0785dea267d84c50dd8e43f8be66afeb"

RPROVIDES:${PN} += "libblkid-devel \
pkgconfig-blkid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1"

inherit rpm
