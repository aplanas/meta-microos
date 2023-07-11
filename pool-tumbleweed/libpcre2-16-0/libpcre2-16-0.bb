SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
libpcre2-16 supports 16-bit and UTF-16 strings."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "libpcre2-16-0-10.42-3.5.aarch64.rpm"
RPM_HASH = "0af7721f24c2a48fbd864f12bf3c396d348cecca70193c5100d22747505f460ccd38f079c7ba10bb34af356148c382e48d9c26c4bb6df835538e8e6dc2bb6f2e"

RPROVIDES:${PN} += "libpcre2-16-0 \
libpcre2-16.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
