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

RPM_NAME = "perl-PPIx-Utils-0.003-1.1.noarch.rpm"
RPM_HASH = "30edf08053f89628cc744cbc70442eb4e9e1e7696af26394c57026ce2dee9bf46febc4940097a104599a6eb3867d198b9cb13d71fd4c00d554a6699c4d703714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PPIx::Utils) \
perl(PPIx::Utils::Classification) \
perl(PPIx::Utils::Language) \
perl(PPIx::Utils::Traversal) \
perl(PPIx::Utils::_Common) \
perl-PPIx-Utils"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(B::Keywords) \
perl(PPI)"

inherit rpm
