SUMMARY = "Debug/Test tool to exercise the btrfs out-of-band deduplication ioctl"
DESCRIPTION = "Debug/Test tool to exercise a btrfs ioctl for deduplicating file regions."
LICENSE = "GPL-2.0-only"

PV = "0.11.3"

RPM_NAME = "btrfs-extent-same-0.11.3-1.7.aarch64.rpm"
RPM_HASH = "d792b580a6f80ed202426d77874070545086883b9afd347cd6f52df419038db6caf856df1a2fa60d7f3f6baefe38c738ffca93ef8120d2361117f63c193a7225"

RPROVIDES:${PN} += "btrfs-extent-same btrfs-extent-same(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
