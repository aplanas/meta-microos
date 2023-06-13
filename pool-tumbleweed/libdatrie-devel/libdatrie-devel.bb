SUMMARY = "Development files for the Double-Array Trie library"
DESCRIPTION = "This is an implementation of double-array structure for representing \
trie, as proposed by Junichi Aoe. \
 \
This package contains the development files for libdatrie."
LICENSE = "LGPL-2.1-only"

PV = "0.2.13"

RPM_NAME = "libdatrie-devel-0.2.13-1.10.aarch64.rpm"
RPM_HASH = "37a589517f4735ce4ea90ea6492baba88813e1bf270db1b95a1dbb701b128c92815b2064181c5087c764446a8009bcfa2fd2673114ff1f8838d7a7862a153ae0"

RPROVIDES:${PN} += "libdatrie-devel \
libdatrie-devel(aarch-64) \
pkgconfig(datrie-0.2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdatrie.so.1()(64bit) \
libdatrie.so.1(DATRIE_0.2)(64bit) \
libdatrie1"

inherit rpm
