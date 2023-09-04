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

RPM_NAME = "perl-MooseX-SemiAffordanceAccessor-0.10-1.27.noarch.rpm"
RPM_HASH = "d6dbc3cdfafa710cbb64f04c99b187591a4fa70c98c7f78a15d404416ac3c7294c0af713a073f334d7ac318405a61e6a4946b7300d9e1f6533f396b64695190a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--SemiAffordanceAccessor \
perl-MooseX--SemiAffordanceAccessor--Role--Attribute \
perl-MooseX-SemiAffordanceAccessor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole"

inherit rpm
