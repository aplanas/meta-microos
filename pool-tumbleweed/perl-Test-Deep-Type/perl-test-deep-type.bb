SUMMARY = "Test::Deep plugin for validating type constraints"
DESCRIPTION = "This is a Test::Deep plugin that provides the sub 'is_type' to indicate \
that the data being tested must validate against the passed type. This is \
an actual type _object_, not a string name -- for example something \
provided via MooseX::Types, or a plain old coderef that returns a bool \
(such as what might be used in a Moo type constraint)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Test-Deep-Type-0.008-1.23.noarch.rpm"
RPM_HASH = "aa3149632ab8cb995484492ca159a350d75192f9944c7be58d69f0edb654e5d73a80957aa0c520ab2c30acb10eb2df6708374a7a6e926983485a9b5852871596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Deep--Type \
perl-Test-Deep-Type"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Deep--Cmp \
perl-Try--Tiny \
perl-parent"

inherit rpm
