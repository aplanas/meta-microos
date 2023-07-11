SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
pcreposix provides a POSIX-compatible API to the PCRE engine."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcreposix0-8.45-2.7.aarch64.rpm"
RPM_HASH = "43bf731ee90634a6c35e78b42c7ea180365fecc73966a06a4ff419b30301453757c544e1ac6dde4a0aba1aa086562c032b89e2206125b24b83026b71d46b4fc2"

RPROVIDES:${PN} += "libpcreposix.so.0 \
libpcreposix0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1"

inherit rpm
