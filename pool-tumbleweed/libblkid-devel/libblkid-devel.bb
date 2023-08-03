SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libblkid-devel-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "830bd54529c44226f91501f9cca0c8f8f7705c8318876fc03f4db1352c4698bb7406c0bbc790c7cfc3e7c19fc07391b598eec3bf7bbd4415135b42c5dfd55d80"

RPROVIDES:${PN} += "libblkid-devel \
pkgconfig-blkid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1"

inherit rpm
