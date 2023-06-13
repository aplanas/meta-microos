SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
pcrecpp provides a C++ API to the PCRE engine."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcrecpp0-8.45-2.6.aarch64.rpm"
RPM_HASH = "a8f51efaaf9e17cfe56c5568d20e5bc0a8c7658b9eb6dc840210e489ec352ae33b39a4859d3fb19b2bdf0c5d11ef8732ad4c1ed2cc459341135ec5d3acc80eae"

RPROVIDES:${PN} += "libpcrecpp.so.0()(64bit) \
libpcrecpp0 \
libpcrecpp0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
