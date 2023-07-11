SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
This PCRE library variant supports 8-bit and UTF-8 strings. \
(See also libpcre16.)"
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcre1-8.45-2.7.aarch64.rpm"
RPM_HASH = "05d4eda9d2b260a1107e697502f4def176aef15617cdd199cad1808bae7c054b2be5b850aeab2dcd7c4b7b77df4014826aae7e3bd1dd4ddbcd098adb0e2d9d66"

RPROVIDES:${PN} += "libpcre.so.1 \
libpcre1 \
pcre"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
