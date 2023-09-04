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

RPM_NAME = "perl-MooX-StrictConstructor-0.011-1.12.noarch.rpm"
RPM_HASH = "85c72d4a9e01557692234601b6727578f713bf46f65f2bd985a077b123b4ea8456e363f7235c91bd8eedfdf92cf4ab09ee0a1ea56dfcf11c2e9018d86dc4d958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Generate--Constructor--Role--StrictConstructor \
perl-MooX--StrictConstructor \
perl-MooX-StrictConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Method--Modifiers \
perl-Moo \
perl-Moo--Role \
perl-strictures"

inherit rpm
