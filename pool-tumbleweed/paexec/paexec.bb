SUMMARY = "Utility for task distribution over networks or CPUs"
DESCRIPTION = "A program that processes a list of tasks in parallel \
on different CPUs, computers in a network or whatever else."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "paexec-1.1.4-2.9.aarch64.rpm"
RPM_HASH = "3aaac3ea30fda5056d97993154457656fcc21e35b1c643e98361ffd1db86ab855bbdb654f6a9d495c5c888fd7c99cd5ab2de0eadbec1b2cf7ef9ca8c18d64c8c"

RPROVIDES:${PN} += "paexec \
paexec(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/runawk \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmaa.so.4()(64bit) \
runawk"

inherit rpm
