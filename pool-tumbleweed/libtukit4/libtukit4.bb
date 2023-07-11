SUMMARY = "Library for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "This package contains the libraries required for programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libtukit4-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "c0e987bc6837d296b38b85958005b5253473d078b7fdd9ade508b31f3b694a63391a7422e939734d84e5de23a4dbe708f3b52b66f7945f876a6dde49319d104b"

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
