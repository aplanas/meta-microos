SUMMARY = "Compact C Type Format library (runtime, no BFD dependency)"
DESCRIPTION = "This package includes the libctf-nobfd shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "libctf-nobfd0-2.40-5.1.aarch64.rpm"
RPM_HASH = "b10cdc7f2805d295edaf2d26c7e52768ed19e51f4cd6379dab0564e702b9f230e16f2806c1df8755bc103000d7811c6cbbd8d6013a561427551451ccb584d2f3"

RPROVIDES:${PN} += "libctf-nobfd.so.0 \
libctf-nobfd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
