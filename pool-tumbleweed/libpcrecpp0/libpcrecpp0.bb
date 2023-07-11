SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
pcrecpp provides a C++ API to the PCRE engine."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcrecpp0-8.45-2.7.aarch64.rpm"
RPM_HASH = "c587b3571d1f491010596cfeb9e962d994571cb3711361f55e508f1ebf55f4872a6279961105f3486aed684f777dead4ba1e8807c6d1bce2da15689eb4889114"

RPROVIDES:${PN} += "libpcrecpp.so.0 \
libpcrecpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
