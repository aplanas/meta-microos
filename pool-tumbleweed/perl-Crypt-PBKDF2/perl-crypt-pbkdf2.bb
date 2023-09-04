SUMMARY = "The PBKDF2 password hashing algorithm"
DESCRIPTION = "PBKDF2 is a secure password hashing algorithm that uses the techniques of \
'key strengthening' to make the complexity of a brute-force attack \
arbitrarily high. PBKDF2 uses any other cryptographic hash or cipher (by \
convention, usually HMAC-SHA1, but 'Crypt::PBKDF2' is fully pluggable), and \
allows for an arbitrary number of iterations of the hashing function, and a \
nearly unlimited output hash size (up to 2**32 - 1 times the size of the \
output of the backend hash). The hash is salted, as any password hash \
should be, and the salt may also be of arbitrary size."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.161520"

RPM_NAME = "perl-Crypt-PBKDF2-0.161520-1.11.noarch.rpm"
RPM_HASH = "c997c1a3181e957b8e8b1848ce3a2d0de3a1d587cedeeb348cd16fc3f174b96d86a5ea4c5c648532aec4914ff7ed4507f7f815368045455a3cd9a0539a783fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--PBKDF2 \
perl-Crypt--PBKDF2--Hash \
perl-Crypt--PBKDF2--Hash--DigestHMAC \
perl-Crypt--PBKDF2--Hash--HMACSHA1 \
perl-Crypt--PBKDF2--Hash--HMACSHA2 \
perl-Crypt--PBKDF2--Hash--HMACSHA3 \
perl-Crypt-PBKDF2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest \
perl-Digest--HMAC \
perl-Digest--SHA \
perl-Digest--SHA3 \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Try--Tiny \
perl-Type--Tiny \
perl-Types--Standard \
perl-namespace--autoclean \
perl-strictures"

inherit rpm
