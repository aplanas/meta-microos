SUMMARY = "Pragma to use the C3 method resolution order algorithm"
DESCRIPTION = "This is pragma to change Perl 5's standard method resolution order from \
depth-first left-to-right (a.k.a - pre-order) to the more sophisticated C3 \
method resolution order. \
 \
*NOTE:* YOU SHOULD NOT USE THIS MODULE DIRECTLY - The feature provided is \
integrated into perl version >= 5.9.5, and you should use MRO::Compat \
instead, which will use the core implementation in newer perls, but \
fallback to using this implementation on older perls."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.35"

RPM_NAME = "perl-Class-C3-0.35-1.13.noarch.rpm"
RPM_HASH = "167a7a76a57fdf757b8bdd894486ed6b3d7a7bbd2ffddd343233feba38c29ffe40fcd0d1aa0d4e972a8b922ac423401725bc1d8f5f345bf6b649c2fc33dbe9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3 \
perl-Class-C3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Algorithm--C3"

inherit rpm
