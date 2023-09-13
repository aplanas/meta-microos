SUMMARY = "Include Files and Libraries for developing with libbtrfsutil"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "libbtrfsutil-devel-6.5-1.1.aarch64.rpm"
RPM_HASH = "710fd324eec99c5b9be4676d02ce2a50a5fc03530de11969009147577ad79d7cf8d843c01a9d898f6e246a548d38216bd78a9c690e3c00a91af0505f9da8b7a3"

RPROVIDES:${PN} += "libbtrfsutil-devel \
pkgconfig-libbtrfsutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
btrfsprogs \
libbtrfsutil1"

inherit rpm
