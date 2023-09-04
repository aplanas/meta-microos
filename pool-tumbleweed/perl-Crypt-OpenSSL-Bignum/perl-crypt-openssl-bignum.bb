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

RPM_NAME = "perl-Crypt-OpenSSL-Bignum-0.09-1.28.aarch64.rpm"
RPM_HASH = "7c798029eb49a203810c9c3cefbcd6d1774ccfc52a2e8fe77df2f35ba5df005cd5902fde1ebda661d30fa3093751ecdf7270d1ae4f2b33bf4f232b905071c23c"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Bignum \
perl-Crypt--OpenSSL--Bignum--CTX \
perl-Crypt-OpenSSL-Bignum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
