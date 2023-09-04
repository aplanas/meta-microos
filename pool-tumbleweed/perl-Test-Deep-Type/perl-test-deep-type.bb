SUMMARY = "Test::Deep plugin for validating type constraints"
DESCRIPTION = "This is a Test::Deep plugin that provides the sub 'is_type' to indicate \
that the data being tested must validate against the passed type. This is \
an actual type _object_, not a string name -- for example something \
provided via MooseX::Types, or a plain old coderef that returns a bool \
(such as what might be used in a Moo type constraint)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Test-Deep-Type-0.008-1.24.noarch.rpm"
RPM_HASH = "5770bc046c23835b4b85205fc1280fb5552bf6290080522f8e95eab085361a24be46b41b1c761ef47a33c74a1710c57b6c4a3d3ccc41c14bc10998db84c2f1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Deep--Type \
perl-Test-Deep-Type"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Deep--Cmp \
perl-Try--Tiny \
perl-parent"

inherit rpm
