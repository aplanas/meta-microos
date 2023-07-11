SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-devel-10.42-3.5.aarch64.rpm"
RPM_HASH = "070a50c73ce0aff06e5d96ff12d9e7998a4c0c4745b6c679838d4aff7a5fb9615d36149046f6e85251a43fc1d7c5546c4c4277e0ca3b25eb05227b4d90c15223"

RPROVIDES:${PN} += "pcre2-devel \
pkgconfig-libpcre2-16 \
pkgconfig-libpcre2-32 \
pkgconfig-libpcre2-8 \
pkgconfig-libpcre2-posix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libpcre2-16-0 \
libpcre2-32-0 \
libpcre2-8-0 \
libpcre2-posix3 \
libstdc++-devel \
pkgconfig-libpcre2-8"

inherit rpm
