SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
libpcre2-32 supports 32-bit and UTF-32 strings."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "libpcre2-32-0-10.42-3.3.aarch64.rpm"
RPM_HASH = "1ab64f56dbc7694ea69ee217289dd1536984d180186f6fc868c64653890f363287be64d893f9f29b15413fe1c3fec2780fb905bfffbcaad72a09f8a1a310316f"

RPROVIDES:${PN} += "libpcre2-32-0 \
libpcre2-32-0(aarch-64) \
libpcre2-32.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
