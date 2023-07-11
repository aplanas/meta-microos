SUMMARY = "Library for commandline flag processing"
DESCRIPTION = "The gflags package contains a library that implements commandline \
flags processing. As such, it is a replacement for getopt(). It has \
increased flexibility, including built-in support for C++ types like \
string, and the ability to define flags in the source file in which \
they're used."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "libgflags2_2-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "2133ffcd9386c8e6696aa7070b2b8a018f7e4e7de43a1ac0ffcb46864cd22947ce70b35e7de75aa88038a230d1d9ab7a030ba8e41d7b78726d04f6f5a2e54f5d"

RPROVIDES:${PN} += "libgflags-nothreads.so.2.2 \
libgflags.so.2.2 \
libgflags2-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
