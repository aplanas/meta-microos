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

RPM_NAME = "perl-Crypt-PBKDF2-0.161520-1.9.noarch.rpm"
RPM_HASH = "25c99a914065857f434bc7bd9b6a608873fc8c0b07d968c52eef8c277bcf0a8e80670460f724295639cce7a875e8adc91ef4ebf264ee1536168cac8db3b3118d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::PBKDF2) \
perl(Crypt::PBKDF2::Hash) \
perl(Crypt::PBKDF2::Hash::DigestHMAC) \
perl(Crypt::PBKDF2::Hash::HMACSHA1) \
perl(Crypt::PBKDF2::Hash::HMACSHA2) \
perl(Crypt::PBKDF2::Hash::HMACSHA3) \
perl-Crypt-PBKDF2"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Digest) \
perl(Digest::HMAC) \
perl(Digest::SHA) \
perl(Digest::SHA3) \
perl(Module::Runtime) \
perl(Moo) \
perl(Moo::Role) \
perl(Try::Tiny) \
perl(Type::Tiny) \
perl(Types::Standard) \
perl(namespace::autoclean) \
perl(strictures)"

inherit rpm
