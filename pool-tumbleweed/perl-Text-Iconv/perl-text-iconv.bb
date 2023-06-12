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

RPM_NAME = "perl-Text-Iconv-1.7-23.37.aarch64.rpm"
RPM_HASH = "f77b70807d160ec2e972a5e9f8ee7f30e7d270f574673d15d6cd05a1fec20b9ee5f7560f189566222790d1e3b6ea19595d787e426ec4f2f76ceba88ca1074c8f"

RPROVIDES:${PN} += "perl(Text::Iconv) \
perl-Text-Iconv \
perl-Text-Iconv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
