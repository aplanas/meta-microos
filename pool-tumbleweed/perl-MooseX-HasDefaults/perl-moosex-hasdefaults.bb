SUMMARY = "Default 'Is' to 'Ro' or 'Rw' for All Attributes"
DESCRIPTION = "The module MooseX::HasDefaults::RO defaults 'is' to 'ro'. \
 \
The module MooseX::HasDefaults::RW defaults 'is' to 'rw'. \
 \
If you pass a specific value to any 'has''s 'is', that overrides the \
default. If you do not want an accessor, pass 'is => undef'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-MooseX-HasDefaults-0.03-2.20.noarch.rpm"
RPM_HASH = "42b8689ed6f521b06cbf53ac2786e13c60cb6ef5dde375b9a403220c74df1555815e94b9ecdcde5be0d02db9929b870c85b70ba23c72f4837633b52c9cde4fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--HasDefaults \
perl-MooseX--HasDefaults--Meta--IsRO \
perl-MooseX--HasDefaults--Meta--IsRW \
perl-MooseX--HasDefaults--RO \
perl-MooseX--HasDefaults--RW \
perl-MooseX-HasDefaults"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
