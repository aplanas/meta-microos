SUMMARY = "Make your Moo-based object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it dies. This is a great way to catch small typos. \
 \
Your application can use Carp::Always to generate stack traces on 'die'. \
Previously all exceptions contained traces, but this could potentially leak \
sensitive information, e.g. \
 \
    My::Sensitive::Class->new( password => $sensitive, extra_value => 'foo' );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.011"

RPM_NAME = "perl-MooX-StrictConstructor-0.011-1.11.noarch.rpm"
RPM_HASH = "548cad5e8ff2f441f6488b401ca1a802889658120a7f6eadbc131dc2729b0605a7c5023130a909bb0ff521272518a83f8bc627dbd7f3a99e4b9b411da6235a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Generate--Constructor--Role--StrictConstructor \
perl-MooX--StrictConstructor \
perl-MooX-StrictConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-Moo \
perl-Moo--Role \
perl-strictures"

inherit rpm
