SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libblkid-devel-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "15c965b70dc64f472236c0f9f3f9a9f326a19669f91e09126926033f85ea525302ea72fdefa0a26f9d0a68c668d5a95a293eab5eced274903d6f7ac99ebece45"

RPROVIDES:${PN} += "libblkid-devel \
pkgconfig-blkid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1"

inherit rpm
