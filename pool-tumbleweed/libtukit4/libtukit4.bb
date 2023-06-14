SUMMARY = "Library for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "This package contains the libraries required for programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.1"

RPM_NAME = "libtukit4-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "aca5a079308dd20526991077e2da87e50bdf41ab89b5d1ac234cd3eea82a9b0eaf5e3dfe4a1b84b057a5fb6e327b1e9263b01b65fad93c9eed8ee6b265d59c5a"

RPROVIDES:${PN} += "libtukit.so.4 \
libtukit4"

RDEPENDS:${PN} += "/sbin/ldconfig \
btrfsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libgcc-s.so.1 \
libmount.so.1 \
libselinux.so.1 \
libstdc++.so.6 \
rsync \
snapper"

inherit rpm
