SUMMARY = "Perl interface to functions that assist in working"
DESCRIPTION = "The 'Crypt::SaltedHash' module provides an object oriented interface to \
create salted (or seeded) hashes of clear text data. The original \
formalization of this concept comes from RFC-3112 and is extended by the \
use of different digital agorithms."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-Crypt-SaltedHash-0.09-5.27.noarch.rpm"
RPM_HASH = "1e359f31cf21d7d34dfb6ec9530e9a614334a0e523ee2416ec7c4ef6160defc3293b40139bc555fe0b2fd1d36bc8e871b533f7e436b6e566487705100d346e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SaltedHash \
perl-Crypt-SaltedHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
