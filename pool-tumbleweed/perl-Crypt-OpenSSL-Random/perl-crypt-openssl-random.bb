SUMMARY = "OpenSSL/LibreSSL pseudo-random number generator access"
DESCRIPTION = "'Crypt::OpenSSL::Random' provides the ability to seed and query the \
*OpenSSL* and *LibreSSL* library's pseudo-random number generators. \
 \
Note: On *LibreSSL* 'random_egd()' is not defined."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Crypt-OpenSSL-Random-0.15-1.28.aarch64.rpm"
RPM_HASH = "302175f584c263314899bb94387289e9486ac436cdea796930f6edc9fc7721c63b5b069ff340272d01221bd951a7c90a81dae4804b33265590ebcdea6b23dd37"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Random \
perl-Crypt-OpenSSL-Random"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
