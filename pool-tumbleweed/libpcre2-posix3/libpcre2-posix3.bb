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

RPM_NAME = "libpcre2-posix3-10.42-3.3.aarch64.rpm"
RPM_HASH = "27b7cd03f900197fc683a58554dd68a814599745e40b8c4a5bb96728bf1899484b26c65f813bcbdfddbc7759bcd9588b886d07a24c82b79d433467cdce3c70b7"

RPROVIDES:${PN} += "libpcre2-posix.so.3()(64bit) \
libpcre2-posix3 \
libpcre2-posix3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm
