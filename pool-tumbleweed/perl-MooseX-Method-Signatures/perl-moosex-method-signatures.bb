SUMMARY = "(DEPRECATED) Method declarations with type constraints and no source filter"
DESCRIPTION = "Provides a proper method keyword, like 'sub' but specifically for making \
methods and validating their arguments against Moose type constraints."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.49"

RPM_NAME = "perl-MooseX-Method-Signatures-0.49-1.23.noarch.rpm"
RPM_HASH = "f5dd5be27d816ee9af00547d2d238e7351491258a3fd5eb7edcbad98de8b23a0ef3e1eac4ff24dd2d2138ef12758a93318a822fc8cc478b7cbb2de13ed907ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Method--Signatures \
perl-MooseX--Method--Signatures--Meta--Method \
perl-MooseX--Method--Signatures--Types \
perl-MooseX-Method-Signatures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
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
