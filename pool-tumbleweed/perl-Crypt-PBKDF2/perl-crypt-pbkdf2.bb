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

RPM_NAME = "perl-Crypt-PBKDF2-0.161520-1.10.noarch.rpm"
RPM_HASH = "3e568d72994dc22f208b820f55b2ffbdd5d659193e6dd40152451af715a72c9f3ddeedecca8ab34fb69b8f0b6620a521f38d9ed4d4a36c45528f2ea096743106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--PBKDF2 \
perl-Crypt--PBKDF2--Hash \
perl-Crypt--PBKDF2--Hash--DigestHMAC \
perl-Crypt--PBKDF2--Hash--HMACSHA1 \
perl-Crypt--PBKDF2--Hash--HMACSHA2 \
perl-Crypt--PBKDF2--Hash--HMACSHA3 \
perl-Crypt-PBKDF2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
