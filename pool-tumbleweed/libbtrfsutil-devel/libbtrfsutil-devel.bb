SUMMARY = "Include Files and Libraries for developing with libbtrfsutil"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfsutil-devel-6.3-2.2.aarch64.rpm"
RPM_HASH = "8e0c862f96ab5525690498ca4770f097219598036d7a4bb6307b0ed54036c1957383a976d3bb249df5576003382fc6c405f517acf203edf098ccb026f1a49139"

RPROVIDES:${PN} += "libbtrfsutil-devel \
pkgconfig-libbtrfsutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
btrfsprogs \
libbtrfsutil1"

inherit rpm
