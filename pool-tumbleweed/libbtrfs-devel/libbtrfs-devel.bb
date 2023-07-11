SUMMARY = "Include Files and Libraries for developing with Btrfs"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfs-devel-6.3-2.2.aarch64.rpm"
RPM_HASH = "3a3402aa49140a3683eddfe3e43b132709f4ad806916da7ecbba6185a1450b3d3a6bc73bd6b9301e00634cd81a991e28fd5c36f7ec068e848ec63427022afa5e"

RPROVIDES:${PN} += "libbtrfs-devel"

RDEPENDS:${PN} += "btrfsprogs \
libbtrfs0"

inherit rpm
