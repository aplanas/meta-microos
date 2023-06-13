SUMMARY = "Name your accessors foo() and set_foo()"
DESCRIPTION = "This module does not provide any methods. Simply loading it changes the \
default naming policy for the loading class so that accessors are separated \
into get and set methods. The get methods have the same name as the \
accessor, while set methods are prefixed with 'set_'. \
 \
If you define an attribute with a leading underscore, then the set method \
will start with '_set_'. \
 \
If you explicitly set a 'reader' or 'writer' name when creating an \
attribute, then that attribute's naming scheme is left unchanged. \
 \
The name 'semi-affordance' comes from David Wheeler's Class::Meta module."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-MooseX-SemiAffordanceAccessor-0.10-1.25.noarch.rpm"
RPM_HASH = "416d158fe8dac6063a422963fe94d94cae819b9d02be313b1d21c02f510f839cb90fec7ecfd804c5bc7573f849d0e3625d8075ff4221d3b3d08128c0b6312d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::SemiAffordanceAccessor) \
perl(MooseX::SemiAffordanceAccessor::Role::Attribute) \
perl-MooseX-SemiAffordanceAccessor"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Moose::Exporter) \
perl(Moose::Role) \
perl(Moose::Util::MetaRole)"

inherit rpm
