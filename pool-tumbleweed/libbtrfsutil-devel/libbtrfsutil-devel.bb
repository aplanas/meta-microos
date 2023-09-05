SUMMARY = "Include Files and Libraries for developing with libbtrfsutil"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfsutil-devel-6.3-3.1.aarch64.rpm"
RPM_HASH = "2f9de15c3723d2cd0438bdd989e10a15ba010807d9ec3665fc7af3af582d1d4bc7eee68f980580354dfa40f0baf81ec2e2c65c81f4007b28fe8707cc0f766e45"

RPROVIDES:${PN} += "libbtrfsutil-devel \
pkgconfig-libbtrfsutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
btrfsprogs \
libbtrfsutil1"

inherit rpm
