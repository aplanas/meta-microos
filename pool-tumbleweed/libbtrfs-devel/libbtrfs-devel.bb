SUMMARY = "Include Files and Libraries for developing with Btrfs"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfs-devel-6.3-1.1.aarch64.rpm"
RPM_HASH = "6c23d8cc935c16e90b5c004234e742c48dcfd152b0b5dbb1c61fde61225b487162ed61b0c3f13401103a0e441ff55704b24caaf414a995030021e49c1a9eb3d3"

RPROVIDES:${PN} += "libbtrfs-devel"

RDEPENDS:${PN} += "btrfsprogs \
libbtrfs0"

inherit rpm
