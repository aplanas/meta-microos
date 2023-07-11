SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
libpcre16 supports 16-bit and UTF-16 strings."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcre16-0-8.45-2.7.aarch64.rpm"
RPM_HASH = "d201f8fa21de4382190140868ae2b29832539468000ec9b4abd1d76c5c980678cf3d7d2bd3c34ce301af2f8f2acb0aebd8c08439e68ac1c33a1780ba5ce7dc7a"

RPROVIDES:${PN} += "libpcre16-0 \
libpcre16.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
