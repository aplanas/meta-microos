SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
This PCRE library variant supports 8-bit and UTF-8 strings. \
(See also libpcre16.)"
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcre1-8.45-2.6.aarch64.rpm"
RPM_HASH = "03dddff9cae93c80d8941c9d0fa9c7b6b0167d5b1ba0e7b8d20e95c241b54fb689d93e07c0c5eb3bd21739679998c050abee0d0eacf735719c6377b401b8fc03"

RPROVIDES:${PN} += "libpcre.so.1()(64bit) \
libpcre1 \
libpcre1(aarch-64) \
pcre"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
