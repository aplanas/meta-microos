SUMMARY = "Load mix-ins or components to your C3-based class"
DESCRIPTION = "This will inject base classes to your module using the Class::C3 method \
resolution order. \
 \
Please note: these are not plugins that can take precedence over methods \
declared in MyModule. If you want something like that, consider \
MooseX::Object::Pluggable."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001002"

RPM_NAME = "perl-Class-C3-Componentised-1.001002-1.18.noarch.rpm"
RPM_HASH = "6c1ff7b53222c86538dc02be58a826eaa84c60f8bb366a837d10edd8e7f8baf14e536757c03121f85ad48b71ccf1a333e6cd483fdb679f36b237bab1e4c746e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3--Componentised \
perl-Class--C3--Componentised--ApplyHooks \
perl-Class-C3-Componentised"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--C3 \
perl-Class--Inspector \
perl-MRO--Compat"

inherit rpm
