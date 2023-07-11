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

RPM_NAME = "perl-Algorithm-C3-0.11-1.12.noarch.rpm"
RPM_HASH = "358d6be666126d84a45a343d45f6264ddad5e06637e4ddf9fe2e516a89e9047b83a2aa35aa6a6789ccc71b0dd25eff260d78bab7602671502111f7da1124e314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--C3 \
perl-Algorithm-C3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
