SUMMARY = "easy aliasing of methods and attributes in Moose"
DESCRIPTION = "The MooseX::Aliases module will allow you to quickly alias methods in \
Moose. It provides an alias parameter for 'has()' to generate aliased \
accessors as well as the standard ones. Attributes can also be initialized \
in the constructor via their aliased names. \
 \
You can create more than one alias at once by passing a arrayref: \
 \
    has ip_addr => ( \
        alias => [ qw(ipAddr ip) ], \
    );"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-Aliases-0.11-5.27.noarch.rpm"
RPM_HASH = "fa71e17b08b9ec759b9709d1bbd9c533afb0f5706933cae5799ad82e003c9712e516b5e4bbaa9a6d1be45afe16e40bc4923d6055be214448fbe3166f00c6b5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Aliases \
perl-MooseX--Aliases--Meta--Trait--Attribute \
perl-MooseX--Aliases--Meta--Trait--Class \
perl-MooseX--Aliases--Meta--Trait--Method \
perl-MooseX--Aliases--Meta--Trait--Role \
perl-MooseX--Aliases--Meta--Trait--Role--ApplicationToClass \
perl-MooseX--Aliases--Meta--Trait--Role--ApplicationToRole \
perl-MooseX--Aliases--Meta--Trait--Role--Composite \
perl-MooseX-Aliases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
