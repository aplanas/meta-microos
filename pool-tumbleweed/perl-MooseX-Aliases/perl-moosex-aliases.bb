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

RPM_NAME = "perl-MooseX-Aliases-0.11-5.26.noarch.rpm"
RPM_HASH = "7cddfc19dd594a9ed7daefd065fb320a7d7d15c98a2e463d9d9f1b1e270ccebbc9ec8a0fc0d4e34160a5dc63157aa481908543a60cabeb516b96938af41f68f4"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
