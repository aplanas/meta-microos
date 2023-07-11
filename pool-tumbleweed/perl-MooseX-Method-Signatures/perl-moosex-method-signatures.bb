SUMMARY = "(DEPRECATED) Method declarations with type constraints and no source filter"
DESCRIPTION = "Provides a proper method keyword, like 'sub' but specifically for making \
methods and validating their arguments against Moose type constraints."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.49"

RPM_NAME = "perl-MooseX-Method-Signatures-0.49-1.24.noarch.rpm"
RPM_HASH = "34858831c63f1975fab3a5acae01d1e26f92e970b56818b2e1ea274431b987b6fa9ef254ed7a24d8dec1be3ca0d5364ded788aaac2b9019f6e85ce9675b031e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Method--Signatures \
perl-MooseX--Method--Signatures--Meta--Method \
perl-MooseX--Method--Signatures--Types \
perl-MooseX-Method-Signatures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--EndOfScope \
perl-Context--Preserve \
perl-Devel--Declare \
perl-Devel--Declare--Context--Simple \
perl-Eval--Closure \
perl-Module--Runtime \
perl-Moose \
perl-Moose--Meta--Class \
perl-Moose--Meta--Method \
perl-Moose--Util \
perl-Moose--Util--TypeConstraints \
perl-MooseX--LazyRequire \
perl-MooseX--Meta--TypeConstraint--ForceCoercion \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Structured \
perl-MooseX--Types--Util \
perl-Parse--Method--Signatures \
perl-Parse--Method--Signatures--Param--Named \
perl-Parse--Method--Signatures--Param--Placeholder \
perl-Parse--Method--Signatures--TypeConstraint \
perl-Parse--Method--Signatures--Types \
perl-Sub--Name \
perl-Task--Weaken \
perl-aliased \
perl-namespace--autoclean"

inherit rpm
