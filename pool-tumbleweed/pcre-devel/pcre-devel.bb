SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-devel-8.45-2.6.aarch64.rpm"
RPM_HASH = "197bb719a02e06e8712714c268562712bcc44ec61c96074a8ec06bb376a8d535140b1ea062d91a94f4d00e4e97fa0ba004f2faddda80290ac318a44a35a5b5e5"

RPROVIDES:${PN} += "pcre-devel \
pcre-devel(aarch-64) \
pkgconfig(libpcre) \
pkgconfig(libpcre16) \
pkgconfig(libpcrecpp) \
pkgconfig(libpcreposix)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libpcre1 \
libpcre16-0 \
libpcrecpp0 \
libpcreposix0 \
libstdc++-devel \
pkgconfig(libpcre)"

inherit rpm
