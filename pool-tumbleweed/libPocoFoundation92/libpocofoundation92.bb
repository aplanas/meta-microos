SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoFoundation92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "628e17c9aa76d7c562bf9122ed309694284e8da1876adfefa1165fed935ac3b06de94ae447e75a61d67a0f2026406e467b701f0d425ef7c8bf42e4741ccc650c"

RPROVIDES:${PN} += "libPocoFoundation.so.92 \
libPocoFoundation92 \
poco-foundation"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
