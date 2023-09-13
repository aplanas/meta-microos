SUMMARY = "Utility library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfsutil.so shared library. This library is \
LGPL unlike libbtrfs.so and can be used by applications to interact with Btrfs \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "libbtrfsutil1-6.5-1.1.aarch64.rpm"
RPM_HASH = "5a077716c8d7070384bed17863f6d27eda0acd5bbcd176660132f75777170648887ee2ebe20b7d3368fb3186a4adc80a32569b7ffb36dd9a564990884c92813e"

RPROVIDES:${PN} += "libbtrfsutil.so.1 \
libbtrfsutil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
