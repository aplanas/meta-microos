SUMMARY = "Development files for libhugetlbfs"
DESCRIPTION = "Devel package, header and static library, of libhugetlbfs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.23.0.g6b126a4"

RPM_NAME = "libhugetlbfs-devel-2.23.0.g6b126a4-3.2.aarch64.rpm"
RPM_HASH = "0b53db40ccb7bbef15e490e1f38bfe33c8ff17f94e09786a98eb94bec9b3c5763efe3167f2514d7a05d927f270981154d546f72c60598366b319cdf13c029128"

RPROVIDES:${PN} += "libhugetlbfs-devel"

RDEPENDS:${PN} += "libhugetlbfs"

inherit rpm
