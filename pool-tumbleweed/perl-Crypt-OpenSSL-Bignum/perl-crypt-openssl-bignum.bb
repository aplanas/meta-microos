SUMMARY = "OpenSSL's multiprecision integer arithmetic"
DESCRIPTION = "Crypt::OpenSSL::Bignum provides access to OpenSSL multiprecision integer \
arithmetic libraries. Presently, many though not all of the arithmetic \
operations that OpenSSL provides are exposed to perl. In addition, this \
module can be used to provide access to bignum values produced by other \
OpenSSL modules, such as key parameters from Crypt::OpenSSL::RSA. \
 \
_NOTE_: Many of the methods in this package can croak, so use eval, or \
Error.pm's try/catch mechanism to capture errors."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Crypt-OpenSSL-Bignum-0.09-1.27.aarch64.rpm"
RPM_HASH = "a257ec8f79e5b1819c496d71abb5fedf4998553be94e84eafd3923c17eb0d985f7c809c61f684cd50e759818226e97417f15912a0fd20071ba314b836588ae81"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Bignum \
perl-Crypt--OpenSSL--Bignum--CTX \
perl-Crypt-OpenSSL-Bignum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
