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

RPM_NAME = "perl-MooseX-SemiAffordanceAccessor-0.10-1.26.noarch.rpm"
RPM_HASH = "09bff739fe7c5b5b917207f3e086bf95bbf6f7201c63e9e71c5f7f206d55fd6063625702c7edab49097c61d7d28e89af2ed5b356b6f7963546246ad0f59088fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--SemiAffordanceAccessor \
perl-MooseX--SemiAffordanceAccessor--Role--Attribute \
perl-MooseX-SemiAffordanceAccessor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole"

inherit rpm
