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

RPM_NAME = "perl-MooseX-Role-WithOverloading-0.17-1.34.aarch64.rpm"
RPM_HASH = "5c795a8c8f33bfb84caca7033a0dcad74c5889b5f38a8fb0a8977bcd9b9a9dc82503a7d374ce159a933994180da94b076899603525c1a7a87d12bdd292da5e8b"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-aliased \
perl-namespace--autoclean \
perl-namespace--clean"

inherit rpm
