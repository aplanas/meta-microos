SUMMARY = "Dummy development package"
DESCRIPTION = "Dummy development package for backwards compatibility."
LICENSE = "LGPL-2.0-only"

PV = "1.47.0"

RPM_NAME = "e2fsprogs-devel-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "47d4bebd9c5354742dfb4f2e4ce2f9854ef1472484e950569234bacbe7701866b2f3e43070764c55f5ae80c6532c7c5d78eb602c9e653525e8749644ac3f238f"

RPROVIDES:${PN} += "e2fsprogs-devel"

RDEPENDS:${PN} += "libblkid-devel \
libext2fs-devel \
libuuid-devel"

inherit rpm
