SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-tools-8.45-2.7.aarch64.rpm"
RPM_HASH = "1a3dbfbe3a42eff281cbed1c001d52ac20f6964fb91f47a65eae736c65c23090d3928c04a815698913636100bb1280d8ce07363bbcffc526de8e44c9f40651d7"

RPROVIDES:${PN} += "pcre-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1 \
libpcre16.so.0 \
libpcreposix.so.0"

inherit rpm
