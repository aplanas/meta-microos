SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-devel-10.42-3.3.aarch64.rpm"
RPM_HASH = "1a59860295fd388c16e841c453811bde8c70876cf45ff970449958090298a213b588dc5064a2f693827ed1762f857f95dd40bcfe88e70cd4d661d63c952d1401"

RPROVIDES:${PN} += "pcre2-devel \
pcre2-devel(aarch-64) \
pkgconfig(libpcre2-16) \
pkgconfig(libpcre2-32) \
pkgconfig(libpcre2-8) \
pkgconfig(libpcre2-posix)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libpcre2-16-0 \
libpcre2-32-0 \
libpcre2-8-0 \
libpcre2-posix3 \
libstdc++-devel \
pkgconfig(libpcre2-8)"

inherit rpm
