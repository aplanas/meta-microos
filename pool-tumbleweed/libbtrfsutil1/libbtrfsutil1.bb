SUMMARY = "Utility library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfsutil.so shared library. This library is \
LGPL unlike libbtrfs.so and can be used by applications to interact with Btrfs \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfsutil1-6.3-2.2.aarch64.rpm"
RPM_HASH = "0dc811dd1024f57245fba2daf4ed72db0553f5b3fd84f13510a6c34eaf6b688e7702f2e139c1c6fe8eba3644ae7b91e365d662ea877f4bccfdf1b933790ad968"

RPROVIDES:${PN} += "libbtrfsutil.so.1 \
libbtrfsutil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
