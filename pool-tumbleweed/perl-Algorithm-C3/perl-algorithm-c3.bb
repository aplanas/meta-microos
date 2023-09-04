SUMMARY = "Module for merging hierarchies using the C3 algorithm"
DESCRIPTION = "This module implements the C3 algorithm. I have broken this out into it's \
own module because I found myself copying and pasting it way too often for \
various needs. Most of the uses I have for C3 revolve around class building \
and metamodels, but it could also be used for things like dependency \
resolution as well since it tends to do such a nice job of preserving local \
precedence orderings. \
 \
Below is a brief explanation of C3 taken from the Class::C3 module. For \
more detailed information, see the SEE ALSO section and the links there."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Algorithm-C3-0.11-1.13.noarch.rpm"
RPM_HASH = "7d50f4c374b144cbbf3557d75c8c6e3e6e0b97c998f504674d7f3495ea3e9a4a1eeb283dd1602692fe7e6a61b6eb06c245b880e760ade6f59305489f28af55ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--C3 \
perl-Algorithm-C3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
