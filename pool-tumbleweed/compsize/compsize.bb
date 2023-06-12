SUMMARY = "Utility for measuring compression ratio of files on btrfs"
DESCRIPTION = "compsize takes a list of files (given as arguments) on a btrfs \
filesystem and measures used compression types and effective \
compression ratio, producing a report."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "compsize-1.5-1.9.aarch64.rpm"
RPM_HASH = "9f08414f1293d6d2176ac2b94fb6a4b77b0ead4b81a9b8be01193f44ececa5dd343a9fce6ce9da090c97b2a23d1f694bc7787fbf16a46756b6f275deacf56204"

RPROVIDES:${PN} += "compsize \
compsize(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
