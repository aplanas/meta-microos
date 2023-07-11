SUMMARY = "Perl interface to iconv() codeset conversion function"
DESCRIPTION = "The Text::Iconv module provides a Perl interface to the iconv() function as \
defined by the Single UNIX Specification. \
 \
The convert() method converts the encoding of characters in the input string \
from the fromcode codeset to the tocode codeset, and returns the result. \
 \
Settings of fromcode and tocode and their permitted combinations are \
implementation-dependent. Valid values are specified in the system \
documentation; the iconv(1) utility should also provide a -l option that lists \
all supported codesets."
LICENSE = "Artistic-1.0"

PV = "1.7"

RPM_NAME = "perl-Text-Iconv-1.7-23.38.aarch64.rpm"
RPM_HASH = "afff522a21a8340fd58197db095a7ee918e0acc779e5fcde3f2a0776f69883b91d10edf54a4b728cee63f10e7cf7c8679760b0fcfeda9ded79492a758534a454"

RPROVIDES:${PN} += "perl-Text--Iconv \
perl-Text-Iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
