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

RPM_NAME = "perl-Crypt-OpenSSL-RSA-0.33-1.4.aarch64.rpm"
RPM_HASH = "02ccd02104e4484fa5cafe0df32bc56ec3904a43b934830d2dfc2444cf4000313c5dd01be613a34722e34e542fff364b86c0506222db63aca39a5d615088dc14"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--RSA \
perl-Crypt-OpenSSL-RSA"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.36.0 \
perl-Crypt--OpenSSL--Random"

inherit rpm
