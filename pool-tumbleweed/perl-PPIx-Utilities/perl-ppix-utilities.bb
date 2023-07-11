SUMMARY = "Extensions to L<PPI|PPI>"
DESCRIPTION = "This is a collection of functions for dealing with PPI objects, many of \
which originated in Perl::Critic. They are organized into modules by the \
kind of PPI class they relate to, by replacing the 'PPI' at the front of \
the module name with 'PPIx::Utilities', e.g. functionality related to \
PPI::Nodes is in PPIx::Utilities::Node."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.001000"

RPM_NAME = "perl-PPIx-Utilities-1.001000-14.16.noarch.rpm"
RPM_HASH = "844a3a03426c64f991e33d5cd55e9f6d498ec8a2b5fcfb3f0be64715b3f6e34a7a806b10cae444a22bcaba33c9bb673b83667fa8e4543a5b9d863e263e5ca771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--Utilities \
perl-PPIx--Utilities--Exception--Bug \
perl-PPIx--Utilities--Node \
perl-PPIx--Utilities--Statement \
perl-PPIx-Utilities"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exception--Class \
perl-PPI \
perl-PPI--Document--Fragment \
perl-Readonly \
perl-Task--Weaken"

inherit rpm
