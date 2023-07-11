SUMMARY = "OpenSSL/LibreSSL pseudo-random number generator access"
DESCRIPTION = "'Crypt::OpenSSL::Random' provides the ability to seed and query the \
*OpenSSL* and *LibreSSL* library's pseudo-random number generators. \
 \
Note: On *LibreSSL* 'random_egd()' is not defined."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Crypt-OpenSSL-Random-0.15-1.27.aarch64.rpm"
RPM_HASH = "91e8a1c97644148f04cda49ec5caf6fc37bea98dfe501dd0e4625c5b0d1788f16b96f7c8ab9927df0c1d1562e00641ed8c1cc35da9281a3223b2c9c496575ba6"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Random \
perl-Crypt-OpenSSL-Random"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
