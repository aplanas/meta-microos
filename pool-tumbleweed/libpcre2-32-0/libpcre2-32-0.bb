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

RPM_NAME = "libpcre2-32-0-10.42-3.5.aarch64.rpm"
RPM_HASH = "3fbdd51750f5865970bc7c017e3ead981ef3b27bcc923cd046270b64df1e9a920b474421ab30bd0a2d75d22261c38023069396ba7bdc8813aa17442dc0269633"

RPROVIDES:${PN} += "libpcre2-32-0 \
libpcre2-32.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
