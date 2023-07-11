SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-go-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "953f43a91702f39a7ef56850921996417bbb3548b460f67ba6b9aeaca984f9c875f5eb407a5b1fca088b935bc275ed04d1514a03f104dc5f06e4002a54fc3977"

RPROVIDES:${PN} += "gcc13-go"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libgo.so.22 \
libgo22 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
