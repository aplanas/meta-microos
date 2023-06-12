SUMMARY = "A Program for Compressing Files"
DESCRIPTION = "The bzip2 program is a program for compressing files."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "bzip2-1.0.8-5.3.aarch64.rpm"
RPM_HASH = "7c0b1466e4a1553cf3f408424c8668486c29c1763dd152d0c6b2f0724ced5b9a64441b3f1ce0801f885802c3e879cc3a98492922f739f49cb2212be406ec6c34"

RPROVIDES:${PN} += "bzip \
bzip2 \
bzip2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2-1 \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
