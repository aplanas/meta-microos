SUMMARY = "Include Files and Libraries for developing with Btrfs"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "libbtrfs-devel-6.5-1.1.aarch64.rpm"
RPM_HASH = "0617f55a5d9fa496d2a777a9c3880c920ea27c8b67b5e159e50f86a1c20fdb3e0a979a54be46e513377c6ca8b7c75c1b24826911c8ab052df216850514e4e434"

RPROVIDES:${PN} += "libbtrfs-devel"

RDEPENDS:${PN} += "btrfsprogs \
libbtrfs0"

inherit rpm
