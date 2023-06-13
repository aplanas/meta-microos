SUMMARY = "Perl interface to functions that assist in working"
DESCRIPTION = "The 'Crypt::SaltedHash' module provides an object oriented interface to \
create salted (or seeded) hashes of clear text data. The original \
formalization of this concept comes from RFC-3112 and is extended by the \
use of different digital agorithms."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-Crypt-SaltedHash-0.09-5.26.noarch.rpm"
RPM_HASH = "2460c445e93e6e6e23cc9232efd19b88a8eb85fb01395faa89e3918d4397229aa398a27ac89bf950f14cc0332709f2fea56b12153e9e1b403d89780b38731765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::SaltedHash) \
perl-Crypt-SaltedHash"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
