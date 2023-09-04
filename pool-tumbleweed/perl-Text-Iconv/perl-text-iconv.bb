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

RPM_NAME = "perl-Text-Iconv-1.7-23.39.aarch64.rpm"
RPM_HASH = "ec6c3f0bace551e44c355c63621ceab995d75c040935b49d2f10363044156eaa2ecbaebd9a4459a0d99c82789ed333adab4951cb74b11a552d94e45f9e4f9198"

RPROVIDES:${PN} += "perl-Text--Iconv \
perl-Text-Iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
