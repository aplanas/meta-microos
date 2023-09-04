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

RPM_NAME = "perl-PPIx-Utils-0.003-1.3.noarch.rpm"
RPM_HASH = "2c838dfbed25629ed7bd8c4420c9017b864cd8393cf6f14e145b6ce9ba43fca295da57818bb50c155f2fc82ce59554aa9da88003893ea593d692f6ad4a453578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--Utils \
perl-PPIx--Utils---Common \
perl-PPIx--Utils--Classification \
perl-PPIx--Utils--Language \
perl-PPIx--Utils--Traversal \
perl-PPIx-Utils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Keywords \
perl-PPI"

inherit rpm
