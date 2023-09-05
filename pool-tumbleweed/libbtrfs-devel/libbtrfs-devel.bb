SUMMARY = "Include Files and Libraries for developing with Btrfs"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfs-devel-6.3-3.1.aarch64.rpm"
RPM_HASH = "a7315e062a74166c6aadf2a695a26f74ad032e37a01ddfb0eecc8d942da97ba5eaa4a7c3612a45b70ac5479466503e48cef4836de761eeb498bb7ccdb1dde4a8"

RPROVIDES:${PN} += "libbtrfs-devel"

RDEPENDS:${PN} += "btrfsprogs \
libbtrfs0"

inherit rpm
