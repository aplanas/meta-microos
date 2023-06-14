SUMMARY = "OpenSSL/LibreSSL pseudo-random number generator access"
DESCRIPTION = "'Crypt::OpenSSL::Random' provides the ability to seed and query the \
*OpenSSL* and *LibreSSL* library's pseudo-random number generators. \
 \
Note: On *LibreSSL* 'random_egd()' is not defined."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Crypt-OpenSSL-Random-0.15-1.26.aarch64.rpm"
RPM_HASH = "22ee33e8b90fe3b36f3c4c360dccce9b47191c21101f7ca9ff1b95b4506880d93bc089c00b2abe8db6c617d90a9732ebaa695c44a0ec73e2218777004c460a76"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Random \
perl-Crypt-OpenSSL-Random"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
