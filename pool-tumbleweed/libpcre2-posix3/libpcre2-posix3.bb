SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
pcre2-posix provides a POSIX-compatible API to the PCRE2 engine."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "libpcre2-posix3-10.42-3.5.aarch64.rpm"
RPM_HASH = "731970de0da2cad44dfa08435605f7d1b871e18ad9c3971718486c89ddfb3ace7c4b7b3af1f7fc2be8c5aa56f6dbc2a46c48cd8ffaf42bee6d9bb300a99a0f29"

RPROVIDES:${PN} += "libpcre2-posix.so.3 \
libpcre2-posix3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
