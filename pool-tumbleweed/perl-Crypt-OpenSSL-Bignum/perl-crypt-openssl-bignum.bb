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

RPM_NAME = "perl-Crypt-OpenSSL-Bignum-0.09-1.26.aarch64.rpm"
RPM_HASH = "0dfb793a93382e4568e7f072af2f95c221fbbf6557750340ebbef89a7208e857ff336106430b49230b21c1c921722d0e3613d208f05269931c4e93509278f700"

RPROVIDES:${PN} += "perl(Crypt::OpenSSL::Bignum) \
perl(Crypt::OpenSSL::Bignum::CTX) \
perl-Crypt-OpenSSL-Bignum \
perl-Crypt-OpenSSL-Bignum(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
