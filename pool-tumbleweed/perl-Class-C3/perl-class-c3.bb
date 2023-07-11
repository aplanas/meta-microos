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

RPM_NAME = "perl-Class-C3-0.35-1.12.noarch.rpm"
RPM_HASH = "62263770d77658db810e7b811d483ebd3ded81a7dc290dc101af6692e254a4a140e30eddd59f8ed9f36694f1802522ffb4cb8f5758cc84d956cb5b261e8d32e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3 \
perl-Class-C3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Algorithm--C3"

inherit rpm
