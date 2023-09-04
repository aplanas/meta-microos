SUMMARY = "RSA encoding and decoding, using the openSSL libraries"
DESCRIPTION = "'Crypt::OpenSSL::RSA' provides the ability to RSA encrypt strings which are \
somewhat shorter than the block size of a key. It also allows for \
decryption, signatures and signature verification. \
 \
_NOTE_: Many of the methods in this package can croak, so use 'eval', or \
Error.pm's try/catch mechanism to capture errors. Also, while some methods \
from earlier versions of this package return true on success, this (never \
documented) behavior is no longer the case."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Crypt-OpenSSL-RSA-0.33-1.6.aarch64.rpm"
RPM_HASH = "a8f9015f42bde597b0923cfa1cf5b81b11fc14702ffe052ca5667d4992b0507f8f4de4a22a8d5c5680269e2280cb7a783410bf84d81f9ddcbfdf3d210fd69c3e"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--RSA \
perl-Crypt-OpenSSL-RSA"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.38.0 \
perl-Crypt--OpenSSL--Random"

inherit rpm
