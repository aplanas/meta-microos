SUMMARY = "Structured Type Constraints for Moose"
DESCRIPTION = "A structured type constraint is a standard container Moose type constraint, \
such as an 'ArrayRef' or 'HashRef', which has been enhanced to allow you to \
explicitly name all the allowed type constraints inside the structure. The \
generalized form is: \
 \
    TypeConstraint[@TypeParameters or %TypeParameters] \
 \
Where 'TypeParameters' is an array reference or hash references of \
Moose::Meta::TypeConstraint objects. \
 \
This type library enables structured type constraints. It is built on top \
of the MooseX::Types library system, so you should review the documentation \
for that if you are not familiar with it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.36"

RPM_NAME = "perl-MooseX-Types-Structured-0.36-1.21.noarch.rpm"
RPM_HASH = "843fd56e7ae809fc589e22ef88b9ab1b37c3045fe263c2a41bef766e6a42d733db21d587073f4e6a33f52e0f84746b92e65213dd28d1e2ca536d42c7f3a5e0e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Structured \
perl-MooseX-Types-Structured"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--PartialDump \
perl-Moose \
perl-Moose--Meta--TypeCoercion \
perl-Moose--Meta--TypeConstraint \
perl-Moose--Meta--TypeConstraint--Parameterizable \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Types \
perl-Sub--Exporter \
perl-namespace--clean"

inherit rpm
