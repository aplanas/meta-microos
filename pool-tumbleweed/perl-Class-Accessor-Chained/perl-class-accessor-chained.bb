SUMMARY = "Make chained accessors"
DESCRIPTION = " \
A chained accessor is one that always returns the object when called with \
parameters (to set), and the value of the field when called with no arguments. \
 \
This module subclasses Class::Accessor in order to provide the same \
mk_accessors interface. \
 \
  Authors:	Richard Clamp <richardc@unixbeard.net> \
-------------------------------------------------------------------------------"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-Class-Accessor-Chained-0.01-13.29.aarch64.rpm"
RPM_HASH = "0da020b624e557d4e6a1cd685dd21fdc5ad60b5f4e723f3f8b07fa327025ba2e100aa3dbdcfacfcd57d295371a86f32f53164732ab058aef3437359d354e5f68"

RPROVIDES:${PN} += "Class-Accessor-Chained \
Class-Accessor-Chained-Fast \
perl(Class::Accessor::Chained) \
perl(Class::Accessor::Chained::Fast) \
perl-Class-Accessor-Chained \
perl-Class-Accessor-Chained(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor)"

inherit rpm
