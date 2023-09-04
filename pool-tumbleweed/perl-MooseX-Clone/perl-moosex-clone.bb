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

RPM_NAME = "perl-MooseX-Clone-0.06-1.26.noarch.rpm"
RPM_HASH = "d221f1c13bee1592b38ea64cfab7ffc8147507034178a68567acfe2daff4eb7eb41bb0b724ac68a330026b9529d7942ba2bf023fc0542e5d05ab54c124ba1fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Clone \
perl-MooseX--Clone--Meta--Attribute--Trait--Clone \
perl-MooseX--Clone--Meta--Attribute--Trait--Clone--Base \
perl-MooseX--Clone--Meta--Attribute--Trait--Clone--Std \
perl-MooseX--Clone--Meta--Attribute--Trait--Copy \
perl-MooseX--Clone--Meta--Attribute--Trait--NoClone \
perl-MooseX--Clone--Meta--Attribute--Trait--StorableClone \
perl-MooseX-Clone"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Visitor \
perl-Data--Visitor--Callback \
perl-Hash--Util--FieldHash--Compat \
perl-Moose--Role \
perl-namespace--autoclean"

inherit rpm
