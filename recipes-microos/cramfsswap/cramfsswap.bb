SUMMARY = "Swap endianess of a cram filesystem (cramfs)"
DESCRIPTION = "cramfs is a highly compressed and size optimized linux filesystem which is \
mainly used for embedded applications. the problem with cramfs is that it \
is endianess sensitive, meaning you can't mount a cramfs for a big endian \
target on a little endian machine and vice versa. this is often especially \
a problem in the development phase. \
 \
cramfsswap solves that problem by allowing you to swap to endianess of a \
cramfs filesystem."
LICENSE = "GPL-2.0-only"

PV = "1.4.2"

RPM_NAME = "cramfsswap-1.4.2-1.7.aarch64.rpm"
RPM_HASH = "ab42fd3063e7a23905d12788a877e89623a446450d11097d0ac33758b92cbbb27515dd397957dd1cdb90b007fc2be04684c1efe08bfbdfbb86ef57e885d6d348"

RPROVIDES:${PN} += "cramfsswap \
cramfsswap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
