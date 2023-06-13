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

RPM_NAME = "perl-Algorithm-C3-0.11-1.11.noarch.rpm"
RPM_HASH = "1cb26b229a14460377d853853058b2ec96fdb108b629fb0b5cce1a4e12c0d96ac3ebde130e5010d96f8953794ec51927101347b782f9c5b1e0f18f24ff7bdbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Algorithm::C3) \
perl-Algorithm-C3"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
