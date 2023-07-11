SUMMARY = "Declare class attributes Moose-style"
DESCRIPTION = "This module allows you to declare class attributes in exactly the same way \
as object attributes, using 'class_has()' instead of 'has()'. \
 \
You can use any feature of Moose's attribute declarations, including \
overriding a parent's attributes, delegation ('handles'), attribute traits, \
etc. All features should just work. The one exception is the 'required' \
flag, which is not allowed for class attributes. \
 \
The accessor methods for class attribute may be called on the class \
directly, or on objects of that class. Passing a class attribute to the \
constructor will not set that attribute."
LICENSE = "Artistic-2.0"

PV = "0.29"

RPM_NAME = "perl-MooseX-ClassAttribute-0.29-1.23.noarch.rpm"
RPM_HASH = "99a293d054d1653924f507ad3284c9595ad75e21a31172f531e00f91f68033a8d05b34d9fa80507da8f4aa328678fa00d036d78c1f732cb82122fb49388a51bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--ClassAttribute \
perl-MooseX--ClassAttribute--Meta--Role--Attribute \
perl-MooseX--ClassAttribute--Trait--Application \
perl-MooseX--ClassAttribute--Trait--Application--ToClass \
perl-MooseX--ClassAttribute--Trait--Application--ToRole \
perl-MooseX--ClassAttribute--Trait--Attribute \
perl-MooseX--ClassAttribute--Trait--Class \
perl-MooseX--ClassAttribute--Trait--Mixin--HasClassAttributes \
perl-MooseX--ClassAttribute--Trait--Role \
perl-MooseX--ClassAttribute--Trait--Role--Composite \
perl-MooseX-ClassAttribute"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--Util \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Meta--Role--Attribute \
perl-Moose--Role \
perl-Moose--Util \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean \
perl-namespace--clean"

inherit rpm
