SUMMARY = "Utility functions for PPI"
DESCRIPTION = "'PPIx::Utils' is a collection of utility functions for working with PPI \
documents. The functions are organized into submodules, and may be imported \
from the appropriate submodule or via this module. \
 \
These functions were originally from Perl::Critic::Utils and related \
modules, and have been split off to this distribution for use outside of \
Perl::Critic."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003"

RPM_NAME = "perl-PPIx-Utils-0.003-1.2.noarch.rpm"
RPM_HASH = "6604f9f7b78da1996f4dae727208278c105a0f4e161429260c57c39d76d0c4a81388eb1d227b8412eb633ccb1a2bda85fdb6707a4efe77c2a6c5352a210b2106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--Utils \
perl-PPIx--Utils---Common \
perl-PPIx--Utils--Classification \
perl-PPIx--Utils--Language \
perl-PPIx--Utils--Traversal \
perl-PPIx-Utils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Keywords \
perl-PPI"

inherit rpm
