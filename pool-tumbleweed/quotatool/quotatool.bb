SUMMARY = "A utility for setting and manipulating filesystem quotas from the command line"
DESCRIPTION = "quotatool is a utility for setting and manipulating filesystem quotas from \
the command line. It supports quota on Linux (versions 2.6, 2.4, and 2.2, \
with ext2, ext3, ReiserFS, and XFS), Solaris, and AIX."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "quotatool-1.6.2-2.15.aarch64.rpm"
RPM_HASH = "2155573e39cfe168f91442da6521a577ad5190caab3b82742d9679a0ee53a588e823f100a154f3affaa1f421c4924e4b62742f71302958d2a3064d0b727f83f6"

RPROVIDES:${PN} += "quotatool \
quotatool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
