SUMMARY = "Perl6 like method signature parser"
DESCRIPTION = "Inspired by Perl6::Signature but streamlined to just support the subset \
deemed useful for TryCatch and MooseX::Method::Signatures."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003019"

RPM_NAME = "perl-Parse-Method-Signatures-1.003019-1.23.noarch.rpm"
RPM_HASH = "dc43f9f5142f57040ffc87f48267a56e3bdae86e79a50d3ce4e735e9f55563c6d8af43973273bcd2ae48b365c77fbd9a678f343e39e958bd7e805316c81f35f5"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
