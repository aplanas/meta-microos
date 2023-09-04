SUMMARY = "Default 'Is' to 'Ro' or 'Rw' for All Attributes"
DESCRIPTION = "The module MooseX::HasDefaults::RO defaults 'is' to 'ro'. \
 \
The module MooseX::HasDefaults::RW defaults 'is' to 'rw'. \
 \
If you pass a specific value to any 'has''s 'is', that overrides the \
default. If you do not want an accessor, pass 'is => undef'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-MooseX-HasDefaults-0.03-2.21.noarch.rpm"
RPM_HASH = "7e08202430065a0aecd331ee75eb028b8c2abe33d6fb8de94656b2112aed8535771508f656cc5eeb7493a62524b5e9c4153611627ac19b2cbeb0476f0300b62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--HasDefaults \
perl-MooseX--HasDefaults--Meta--IsRO \
perl-MooseX--HasDefaults--Meta--IsRW \
perl-MooseX--HasDefaults--RO \
perl-MooseX--HasDefaults--RW \
perl-MooseX-HasDefaults"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
