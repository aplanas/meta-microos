SUMMARY = "(DEPRECATED) Roles which support overloading"
DESCRIPTION = "MooseX::Role::WithOverloading allows you to write a the Moose::Role manpage \
which defines overloaded operators and allows those overload methods to be \
composed into the classes/roles/instances it's compiled to, where plain the \
Moose::Role manpages would lose the overloading. \
 \
Starting with the Moose manpage version 2.1300, this module is no longer \
necessary, as the functionality is available already. In that case, 'use \
MooseX::Role::WithOverloading' behaves identically to 'use Moose::Role'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-MooseX-Role-WithOverloading-0.17-1.35.aarch64.rpm"
RPM_HASH = "e6b02623fe9d62668c87c6da93fa74abb96b0fe8f4b4966160b988c02eef11c5422a6e872ce1d7ee02cc627a15e014ce1c8da9dd77ffeb939521c6f91416b0e7"

RPROVIDES:${PN} += "perl-MooseX--Role--WithOverloading \
perl-MooseX--Role--WithOverloading--Meta--Role \
perl-MooseX--Role--WithOverloading--Meta--Role--Application \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite--ToClass \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite--ToInstance \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite--ToRole \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--FixOverloadedRefs \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--ToClass \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--ToInstance \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--ToRole \
perl-MooseX--Role--WithOverloading--Meta--Role--Composite \
perl-MooseX-Role-WithOverloading"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-aliased \
perl-namespace--autoclean \
perl-namespace--clean"

inherit rpm
