SUMMARY = "Perl interface to functions that assist in working"
DESCRIPTION = "The 'Crypt::SaltedHash' module provides an object oriented interface to \
create salted (or seeded) hashes of clear text data. The original \
formalization of this concept comes from RFC-3112 and is extended by the \
use of different digital agorithms."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-Crypt-SaltedHash-0.09-5.28.noarch.rpm"
RPM_HASH = "8148ec85addebc4a007b345cae46e9ecab28cfd7d10f42e91a8e46a970dcd82ffa360b00f4aac034ba33c9d89a2675d4373fff3b5f5a76a2f800e374b63dd6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SaltedHash \
perl-Crypt-SaltedHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
