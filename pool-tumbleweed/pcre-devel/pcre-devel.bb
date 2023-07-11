SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-devel-8.45-2.7.aarch64.rpm"
RPM_HASH = "c4cf1fd4ebfa152a030ee3a992ab0ba72149723bbf3812bc34615b8c74583a0fdb9b95adbd8ff33eace108069d85508a9c91d7399eb973263840aaf4fa6123b2"

RPROVIDES:${PN} += "pcre-devel \
pkgconfig-libpcre \
pkgconfig-libpcre16 \
pkgconfig-libpcrecpp \
pkgconfig-libpcreposix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libpcre1 \
libpcre16-0 \
libpcrecpp0 \
libpcreposix0 \
libstdc++-devel \
pkgconfig-libpcre"

inherit rpm
