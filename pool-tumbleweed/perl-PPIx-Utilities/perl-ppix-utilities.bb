SUMMARY = "Extensions to L<PPI|PPI>"
DESCRIPTION = "This is a collection of functions for dealing with PPI objects, many of \
which originated in Perl::Critic. They are organized into modules by the \
kind of PPI class they relate to, by replacing the 'PPI' at the front of \
the module name with 'PPIx::Utilities', e.g. functionality related to \
PPI::Nodes is in PPIx::Utilities::Node."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.001000"

RPM_NAME = "perl-PPIx-Utilities-1.001000-14.17.noarch.rpm"
RPM_HASH = "b633eadbf76228991251eb66c1759a8b119aa4a388f5739c48a0f69c122ace0dbce33301c97b7e1dfd746c58ef6bb22131bd5a066d2b6458efe5a8f0e1da01f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--Utilities \
perl-PPIx--Utilities--Exception--Bug \
perl-PPIx--Utilities--Node \
perl-PPIx--Utilities--Statement \
perl-PPIx-Utilities"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exception--Class \
perl-PPI \
perl-PPI--Document--Fragment \
perl-Readonly \
perl-Task--Weaken"

inherit rpm
