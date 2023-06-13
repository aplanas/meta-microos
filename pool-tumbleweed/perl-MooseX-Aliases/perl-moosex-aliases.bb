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

RPM_NAME = "perl-MooseX-Aliases-0.11-5.25.noarch.rpm"
RPM_HASH = "ffbddedc82366126c2ac8fa134a6c6a0d5a356b6cf54dc3a0685571dbda69003444429a029314e70e085d9c0ddeeca5c944e7bcc367a0f05054085185e409c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Aliases) \
perl(MooseX::Aliases::Meta::Trait::Attribute) \
perl(MooseX::Aliases::Meta::Trait::Class) \
perl(MooseX::Aliases::Meta::Trait::Method) \
perl(MooseX::Aliases::Meta::Trait::Role) \
perl(MooseX::Aliases::Meta::Trait::Role::ApplicationToClass) \
perl(MooseX::Aliases::Meta::Trait::Role::ApplicationToRole) \
perl(MooseX::Aliases::Meta::Trait::Role::Composite) \
perl-MooseX-Aliases"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Moose::Exporter) \
perl(Moose::Role) \
perl(Moose::Util::TypeConstraints)"

inherit rpm
