SUMMARY = "Fine-grained cloning support for Moose objects"
DESCRIPTION = "Out of the box the Moose manpage only provides very barebones cloning \
support in order to maximize flexibility. \
 \
This role provides a 'clone' method that makes use of the low level cloning \
support already in the Moose manpage and adds selective deep cloning based \
on introspection on top of that. Attributes with the 'Clone' trait will \
handle cloning of data within the object, typically delegating to the \
attribute value's own 'clone' method."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-MooseX-Clone-0.06-1.24.noarch.rpm"
RPM_HASH = "c157d09827666e6fd1eaf99d928ca1101f2bc2c166e123ea157aa74575d6ba6c102a227fea6c9dba2a7d5075af2ce212d1d23e2e665c13f1ddf3c1c705375db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Clone) \
perl(MooseX::Clone::Meta::Attribute::Trait::Clone) \
perl(MooseX::Clone::Meta::Attribute::Trait::Clone::Base) \
perl(MooseX::Clone::Meta::Attribute::Trait::Clone::Std) \
perl(MooseX::Clone::Meta::Attribute::Trait::Copy) \
perl(MooseX::Clone::Meta::Attribute::Trait::NoClone) \
perl(MooseX::Clone::Meta::Attribute::Trait::StorableClone) \
perl-MooseX-Clone"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Visitor) \
perl(Data::Visitor::Callback) \
perl(Hash::Util::FieldHash::Compat) \
perl(Moose::Role) \
perl(namespace::autoclean)"

inherit rpm
