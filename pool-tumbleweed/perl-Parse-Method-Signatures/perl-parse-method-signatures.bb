SUMMARY = "Perl6 like method signature parser"
DESCRIPTION = "Inspired by Perl6::Signature but streamlined to just support the subset \
deemed useful for TryCatch and MooseX::Method::Signatures."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003019"

RPM_NAME = "perl-Parse-Method-Signatures-1.003019-1.22.noarch.rpm"
RPM_HASH = "2e92575a59d7866662e7fcbafb19a0a0c964a6abd316acca3433870136d314ebcb71e50f8beae2992ee7cc527768eba41f058a344188b3a1ac9f0d02503dfdb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--Method--Signatures \
perl-Parse--Method--Signatures--Param \
perl-Parse--Method--Signatures--Param--Bindable \
perl-Parse--Method--Signatures--Param--Named \
perl-Parse--Method--Signatures--Param--Placeholder \
perl-Parse--Method--Signatures--Param--Positional \
perl-Parse--Method--Signatures--Param--Unpacked \
perl-Parse--Method--Signatures--Param--Unpacked--Array \
perl-Parse--Method--Signatures--Param--Unpacked--Hash \
perl-Parse--Method--Signatures--ParamCollection \
perl-Parse--Method--Signatures--Sig \
perl-Parse--Method--Signatures--TypeConstraint \
perl-Parse--Method--Signatures--Types \
perl-Parse-Method-Signatures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Class--Load \
perl-List--MoreUtils \
perl-Moose \
perl-MooseX--Traits \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Structured \
perl-PPI \
perl-namespace--clean"

inherit rpm
