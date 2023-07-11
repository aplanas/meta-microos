SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
This PCRE2 library variant supports 8-bit and UTF-8 strings. \
(See also libpcre2-16 and libpcre2-32)"
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "libpcre2-8-0-10.42-3.5.aarch64.rpm"
RPM_HASH = "e88761d2d23499f3c8b1811781e4b58aebec40eeebb9ef0137acb6bce6e9b92eeb7b51679967bc26f1f4b55090b9550b70e89fc6ffb58fdbdf3bdf23c9d2209d"

RPROVIDES:${PN} += "libpcre2-8-0 \
libpcre2-8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
