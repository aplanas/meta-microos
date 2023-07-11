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

RPM_NAME = "perl-MooseX-Clone-0.06-1.25.noarch.rpm"
RPM_HASH = "6f7e6605536efcc04729428c8d96b9041b8b4cdbf8f62a7e8ff23cd5e08018b169ee1e862b1db160c6e9b7f9bd1bcc464c51d89a986c0ae6423ea010b5309292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Clone \
perl-MooseX--Clone--Meta--Attribute--Trait--Clone \
perl-MooseX--Clone--Meta--Attribute--Trait--Clone--Base \
perl-MooseX--Clone--Meta--Attribute--Trait--Clone--Std \
perl-MooseX--Clone--Meta--Attribute--Trait--Copy \
perl-MooseX--Clone--Meta--Attribute--Trait--NoClone \
perl-MooseX--Clone--Meta--Attribute--Trait--StorableClone \
perl-MooseX-Clone"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Visitor \
perl-Data--Visitor--Callback \
perl-Hash--Util--FieldHash--Compat \
perl-Moose--Role \
perl-namespace--autoclean"

inherit rpm
