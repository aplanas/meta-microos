SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-tools-10.42-3.5.aarch64.rpm"
RPM_HASH = "f57e7a3f915672f7b79b236a577184a0b97073c7b11972c90a8b77618ff781324ed5589415b9c6f3674c1c52df4c766146c717b08736b5081a71f65fe5db0bc6"

RPROVIDES:${PN} += "pcre2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libedit.so.0 \
libpcre2-16.so.0 \
libpcre2-32.so.0 \
libpcre2-8.so.0 \
libpcre2-posix.so.3 \
libz.so.1"

inherit rpm
